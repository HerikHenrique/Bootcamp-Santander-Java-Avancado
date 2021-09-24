package Threads;

public class TrheadsExemplo {
    public static void main(String[] args) {
        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        BarraDeCarregamento3 barraDeCarregamento3 = new BarraDeCarregamento3();
        barraDeCarregamento2.start();
        barraDeCarregamento3.start();

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
        System.out.println("Barra de Carregamento 2: " + this.getName());

        try {
            Thread.sleep(7000);
            System.out.println("Barra de Carregamento 2: " + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 extends Thread{
    @Override
    public void run() {
        super.run();


        try {
            Thread.sleep(4000);
            System.out.println("Barra de Carregamento 3: " + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}