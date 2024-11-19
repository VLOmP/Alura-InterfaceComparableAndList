import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(26);
        numeros.add(17);
        numeros.add(3);
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);

        Titulo titulo1 = new Titulo("Aachjbakjscnj", 2010);
        Titulo titulo2 = new Titulo("tavchbbai", 2012);
        Titulo titulo3 = new Titulo("dkascjbcajn", 1998);
        Titulo titulo4 = new Titulo("shbcijanckl", 2004);
        Titulo titulo5 = new Titulo("Aachjbakjscn", 2009);

        List<Titulo> titulos = new LinkedList<>();
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
        titulos.add(titulo4);
        titulos.add(titulo5);
        Collections.sort(titulos);
        System.out.println("Titulos ordenados pelo nome: " + titulos);
        titulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Titulos ordenados pelo nome e ano de lançamento: " + titulos);


    }
}
