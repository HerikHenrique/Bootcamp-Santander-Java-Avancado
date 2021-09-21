package InterfaceFuncional;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class interaçoes {
    public static void main(String[] args){
        String[] nomes = {"Herik", "Henrique", "Da Silva", "Martins"};
        Integer[] numeros = {1,2,3,4,5};
        imprimirNomesFiltrados(nomes);
        arr(nomes);
        multiplica(numeros);
    }
//test 2
    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir= "";
        for(int i = 0; i<nomes.length; i++) {
            if(nomes[i].equals("Henrique")){
                nomesParaImprimir+=" "+nomes[i];
            }
        }
        String nomesParaImprimirdaString = Stream.of(nomes)
                .filter(nome -> nome.equals("Herik"))
                .collect(Collectors.joining());  //metodo Joing pega um array de Strings e transforma tudo em uma String só
        System.out.println(nomesParaImprimir);
        System.out.println(nomesParaImprimirdaString);

    }

    public static void arr(String... nomes){
        for (String nome : nomes){
            System.out.println(nome);
        }
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo ForEach: "+nome));//.forEach(nome -> System.out.println(nome); ou - .forEach(System.out::println);
    }

    public static void multiplica(Integer[] numeros){
        Stream.of(numeros)
                .forEach(collection -> System.out.println("Array: "+collection*2));
    }


}//Final da Classe Interações
