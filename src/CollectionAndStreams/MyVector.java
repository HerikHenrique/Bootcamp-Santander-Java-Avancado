package CollectionAndStreams;

import java.util.List;
import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Volei");
        esportes.add("Nfl");

        esportes.set(2, "Boxe");

        System.out.println(esportes);
    }
}
