import java.time.Instant;
import java.util.Date;

public class main {
    public static void main(String[] args){

        Date dataPassada = new Date(1513124807691L);
        System.out.println(dataPassada);

        Date dataFuturo = new Date(1613124807691L);
        System.out.println(dataFuturo);

        boolean antesDaData = dataPassada.after(dataFuturo);
        System.out.println(antesDaData);

        boolean depoisDaData = dataPassada.before(dataFuturo);
        System.out.println(depoisDaData);

        Date copiaDoFuturo = new Date(1613124807691L);
        boolean comparando = copiaDoFuturo.equals(dataFuturo);
        System.out.println(comparando);

        int case1 = dataPassada.compareTo(dataFuturo);
        System.out.println(case1);

        //Classe Instant - Outra forma de trabalhar com Date, surgiu do JDK 1.8, imutável e Thread Safe, modela um
        // de uma linha do tempo, indicado para gravar marcações temporais em eventos da sua aplicação.
        Instant instant = dataPassada.toInstant();
        System.out.println(instant);

        long millis = System.currentTimeMillis();
        System.out.println(millis);

    }
}