package CollectionAndStreams;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Italia", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        //Atualiza o valor da chave passada no parametro put()
        System.out.println(campeoesMundialFifa.put("Brasil", 6));
        System.out.println(campeoesMundialFifa);

        //Retorna o valor da chave passada no método get()
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna um Boolean se existir uma chave com o parametro passado
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Remove a Chave e Valor da lista
        System.out.println(campeoesMundialFifa.remove("Espanha"));

        //Retorna se existe ou não uma chave com o parametro passado
        System.out.println(campeoesMundialFifa.containsKey("Espanha"));

        //Verifica se na lista alguem tem o valor com aquele parâmetro passado
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Retorna o tamanho da Lista
        System.out.println(campeoesMundialFifa.size());

        //Retorna o valor, da chave passado no get()
        System.out.println(campeoesMundialFifa.get("Inglaterra"));



      /*  for (String key : campeoesMundialFifa.keySet()){
            System.out.println(key + "<------>" + campeoesMundialFifa.get(key));
        }

        for(Map.Entry<String, Integer> key : campeoesMundialFifa.entrySet()){
            System.out.println(key.getKey() + ": Copas do Mundo Ganhas: " + key.getValue());
        }*/
    }
}
