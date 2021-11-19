package CollectionAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

        nomes.set(2, "Larissa");

        System.out.println(nomes);
        //Sort(); sorteia os elementos da Lista
        Collections.sort(nomes);

        System.out.println(nomes);
        //remove() recebe 2 implementações. 1 - Remove pelo Indice
        nomes.remove(4);

        System.out.println(nomes);
        // Remove pelo conteúdo da String
        nomes.remove("Carlos");

        System.out.println(nomes);
        // exibir o indice especificado, necessário colocar em uma variável
        String nome = nomes.get(3);

        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temNome = nomes.contains("anderson");
        System.out.println(temNome);

        boolean meuEmpty = nomes.isEmpty();
        System.out.println(meuEmpty);

        //indexOf(); se não tiver na lista o resultado é -1
        int posicao = nomes.indexOf("Larissa");
        System.out.println(posicao);

        for (String nomeDoItem: nomes){
            System.out.println(nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        //has.Next() retorna um Boolean sempre que existir mais um item no nosso array
        //next() retorna o objeto que estamos iterando no momento
        while (iterator.hasNext()){
            System.out.println(">>>>>>>" + iterator.next());
        }
    }
}
