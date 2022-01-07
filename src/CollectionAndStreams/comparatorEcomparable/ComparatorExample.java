package CollectionAndStreams.comparatorEcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args){

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("Ordem de inserção \n" + estudantes + "\n");

        //Ordem por numeros, da idade maior para a Idade menor
        System.out.println("Ordem Natural dos numeros - Idade --");
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);

        //Ordem de Idade do Menor para o Maior
        System.out.println("Ordem reversa dos numeros - Idade --");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);

        System.out.println("Ordem natural dos numeros - Idade (Method Reference) ---");
        System.out.println(estudantes);
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("Ordem reversa dos numeros");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes + "\n");

        Collections.sort(estudantes); // sort() inclui por ordem de inclusão
        System.out.println(estudantes + "\n");

        System.out.println("Ordem reverswa dos numeros idade - Interface Comparator -- ");
        Collections.sort(estudantes, new meuComparator());
        System.out.println(estudantes);





    }
}
