package JavaIntermediario;

import java.util.function.UnaryOperator;

public class Paradigma {
    public static void main(String[] args){
        UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor*3;//Um conceito do paradigma funcional ou programação funcional
        int valor = 10;
        System.out.println("O Resultado é:"+ calcularValorVezesTrinta.apply(10));
    }
}