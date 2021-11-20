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

        System.out.println(treeCapitals.first());


        System.out.println(treeCapitals.last());


        System.out.println(treeCapitals.lower("Florianópolis"));

    }
}
