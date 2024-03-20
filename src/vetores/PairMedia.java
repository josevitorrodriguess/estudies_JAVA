package vetores;

import java.util.Scanner;

public class PairMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter  vetor:");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i <vect.length;i++){
            System.out.println("Digite um número:");
            vect[i] = sc.nextInt();
        }

        double sum =0;
        int cont =0;

        for (int i = 0; i <vect.length;i++){
            if (vect[i]%2==0){
            sum += vect[i];
            cont++;
            }
        }
        double media = sum/cont;

        if (media>0){
            System.out.printf("MEDIA DOS PARES = %.1f%n",media);
        }else{
            System.out.println("NENHUM NUMERO PAR");
        }



    }
}
