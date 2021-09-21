package Recursividade;

public class TailCall {
    public static void main(String[] args){
        System.out.println(fatorial(5));
    }
    public static double fatorial( double valor){
        return fatorialTailCall(valor, 1);
    }
    public static double fatorialTailCall(double valor, double numero) {
        if (valor == 1) {
            return numero;
        }
        return fatorialTailCall(valor - 1, numero*valor);
    }// 5*4*3*2*1 Recursividade padrão, começa do final
}//No TailCall ele começa do início: 5*4=20 20*3=60 60*2=120 120*1=120
