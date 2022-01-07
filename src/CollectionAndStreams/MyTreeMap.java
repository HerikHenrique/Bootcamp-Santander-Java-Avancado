package CollectionAndStreams;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitals = new TreeMap<>();

        treeCapitals.put("RS", "Porto Alegre");
        treeCapitals.put("SC", "Florianópolis");
        treeCapitals.put("PR", "Curitiba");
        treeCapitals.put("SP", "São Paulo");
        treeCapitals.put("RJ", "Rio de Janeiro");
        treeCapitals.put("BH", "Belo Horizonte");

        System.out.println(treeCapitals);

        System.out.println(treeCapitals.firstKey());

        System.out.println(treeCapitals.lastKey());

        //Retorna a menor chave, acima do especificado no parametro
        System.out.println(treeCapitals.lowerKey("SC"));

        //Retorna a maior chave abaixo da key passada no para
        System.out.println(treeCapitals.higherKey("SC"));

        System.out.println(treeCapitals.firstEntry().getKey() + " - " + treeCapitals.firstEntry().getValue());

        System.out.println(treeCapitals.lastEntry().getKey() + " - " + treeCapitals.lastEntry().getValue());

        System.out.println(treeCapitals.lowerEntry("RJ").getKey() + " - " + treeCapitals.lowerEntry("RJ"));

        System.out.println(treeCapitals.higherEntry("SC").getKey() + " - " + treeCapitals.higherEntry("SC").getValue());

        //PollFirst Retorna o 1 elemento da árvore, porem exclui ele da arvore
        Map.Entry<String, String> firstEntry = treeCapitals.pollFirstEntry();

        //PolllastEntry(); retorna o ultimo elemento da árvore, pore exclui ele
        Map.Entry<String, String> lastEntry = treeCapitals.pollLastEntry();

        System.out.println(firstEntry);
        System.out.println(lastEntry);

        //Usando a Classe iterator, crio uma variável que recebe: a lista, com as keys dentro
        Iterator<String> iterator = treeCapitals.keySet().iterator();
        System.out.println(iterator);

        System.out.println(treeCapitals);
        //has.Next(); Retorna o próximo elemento
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitals.get(key));
        }
    }
}
