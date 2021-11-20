package CollectionAndStreams;

import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitals = new TreeSet<>();

        treeCapitals.add("Porto Alegre");
        treeCapitals.add("Florianópolis");
        treeCapitals.add("Curitiba");
        treeCapitals.add("São Paulo");
        treeCapitals.add("Rio de Janeiro");
        treeCapitals.add("Belo Horizonte");

        System.out.println(treeCapitals);

        //Retorna a primeira capital no topo de Arvore
        System.out.println(treeCapitals.first());

        //Retorna a ultima capital no final da Arvore
        System.out.println(treeCapitals.last());

        //Retorna a primeira capital abaixo na arvore da capital passada por parametro
        System.out.println(treeCapitals.lower("Florianópolis"));

        //Retorna a capital acima da arvore parametrizada
        System.out.println(treeCapitals.higher("Florianópolis"));



    }
}
