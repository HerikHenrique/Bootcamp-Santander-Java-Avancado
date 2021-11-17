package CollectionAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula1InterfaceList {

    public static void main(String[] args) {
        //1° coisa a se fazer para utilizar uma lista é instanciar ela
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);
    }
}
