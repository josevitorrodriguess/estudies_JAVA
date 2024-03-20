package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter  vetor:");
        int n = sc.nextInt();

        double[] vect = new double[n];


        for (int i = 0; i <vect.length;i++){
            System.out.println("Digite um número:");
            vect[i] = sc.nextDouble();
        }

        double sum =0;
        int cont =0;

        for (int i = 0; i <vect.length;i++){
            sum += vect[i];
            cont++;
        }

        double media = sum/cont;


        System.out.printf("MEDIA DO VETOR= %.3f%n",media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i <vect.length;i++){
            if (vect[i]<media){
                System.out.println(vect[i]);
            }
        }
    }
}
