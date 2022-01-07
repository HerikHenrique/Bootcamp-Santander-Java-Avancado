package CollectionAndStreams;

import java.util.Scanner;

public class facu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0, i, soma = 0, y =10;

        for (i=0; i < y; i++){
            System.out.println("Digite o item: ");
            int scan = sc.nextInt();
            x = scan;
            soma = soma + x;
            y = y - i;
            System.out.printf("Total: %d, Variavel i: %d, Variavel y: %d", soma, i, y);
        }

//        int n, n1 = 0;
//        float media = 0;
//        System.out.println("Digite N: ");
//        n = sc.nextInt();
//
//        while (n1 < n){
//            System.out.println("Digite X: ");
//            int x = sc.nextInt();
//            media = media + x;
//            n1 = n1 + 1;
//            System.out.println("Media: " + media);
//        }

//        int a = 0,b = 0,n=10;
//        for (int i = 0; i<= 4; i++){
//
//        while (n>0){
//            if (n%2==0) {
//                a++;
//                b++;
//
//
////                System.out.println(a + b);
//            }else{
//                n = n/2;
//                b++;
//
////                System.out.println(a + b);
//
//            }
////break;
//            }
//        System.out.printf("Variavel A %d, Variavel b: %d \n", a, b);
//            int i1 = i;
//
//        }
//
//        int linha = 1, coluna = 0;
//        while (linha <5){
//            coluna = 1;
//            while (coluna < 5){
//                int sum = linha * coluna;
//                System.out.printf("Linha: %d x Coluna %d = %d \n", linha, coluna, sum);
//                coluna +=1;
//            }
//            linha = linha + 1;
//        }
//        System.out.printf("Linha: %d x Coluna %d = %d \n", linha, coluna);
//

        sc.close();
    }
}
