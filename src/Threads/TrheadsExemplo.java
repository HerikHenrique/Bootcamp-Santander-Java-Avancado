package Threads;

public class TrheadsExemplo {
    public static void main(String[] args) {
        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        BarraDeCarregamento2 barraDeCarregamento22 = new BarraDeCarregamento2();
        barraDeCarregamento2.start();
        barraDeCarregamento22.start();

    }
}


class GerarPDF implements Runnable{
    @Override
    public void run() {
        System.out.println("Gerar PDF");
    }
}


class BarraDeCarregamento implements Runnable{
    @Override
    public void run(){
        System.out.println("Loading...");
    }
}
//Para trabalhar com Threads há 2 formas.

class BarraDeCarregamento2 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Rodei: " + this.getName());
    }
}