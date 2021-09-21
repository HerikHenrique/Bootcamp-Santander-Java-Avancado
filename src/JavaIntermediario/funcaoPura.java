package JavaIntermediario;

import java.util.function.BiPredicate;

public class funcaoPura {
    public static void main(String[] args){
        BiPredicate<Integer, Integer> verificaSeEMaior =
                (parametro, valorSeraComparado) -> parametro > valorSeraComparado;
        System.out.println(verificaSeEMaior.test(13,12));
    }
}
