package CollectionAndStreams;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args){

        Queue<String> filaDebanco = new LinkedList<>();

        filaDebanco.add("Patricia");
        filaDebanco.add("Roberto");
        filaDebanco.add("Flavio");
        filaDebanco.add("Pamela");
        filaDebanco.add("Anderson");

        System.out.println(filaDebanco);

        //Queue.poll(); retorna e remove o primeiro elemento da fila.
        String clienteASerAtendido = filaDebanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaDebanco);

        //Queue.peek() retorna mas não remove o primeiro elemento
        String primeiroCliente = filaDebanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaDebanco);

        //filaDebanco.clear();

        //element(); Retorna o primeiro elemento, porem, se a fila estiver vazia retorna um erro
        String primeiroClienteOuErro = filaDebanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaDebanco);

        for (String cliente: filaDebanco){
            System.out.println(cliente);
        }

        Iterator<String> iteratorFilaDeBanco = filaDebanco.iterator();

        while(iteratorFilaDeBanco.hasNext()){
            System.out.println(iteratorFilaDeBanco.next());
        }

        System.out.println(filaDebanco.size());
        System.out.println(filaDebanco.isEmpty());

    }
}
