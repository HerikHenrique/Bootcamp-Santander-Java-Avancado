package InterfaceFuncional;

public class FuncaoAltaOrdem {
    public static void main(String[] args){
        Calculo soma = (a,b) -> a+b;
        Calculo subtracao = (a,b) -> a-b;
        Calculo divisao = (a,b) -> a/b;
        Calculo multiplicacao = (a,b) -> a*b;
        System.out.println(executarOperacao(soma, 1, 3));
        System.out.println(executarOperacao(subtracao, 4, 3));
        System.out.println(executarOperacao(divisao, 4, 2));
        System.out.println(executarOperacao(multiplicacao, 7, 3));
    }

    public static int executarOperacao(Calculo calculo,int a, int b){
        return calculo.calcular(a,b);
    }
}

interface Calculo{
    public int calcular(int a, int b);
}
/*
Função de alta ordem ou Function Interface
*Por parametro recebe outra função, ou ela retorna outra função
 */
