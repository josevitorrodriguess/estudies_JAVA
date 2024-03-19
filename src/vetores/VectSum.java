package vetores;

import java.util.Scanner;

public class VectSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i =0; i <vect.length;i++){
            System.out.println("Digite um número:");
            vect[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i <vect.length;i++){
            sum += vect[i];
        }

        int average = sum/ vect.length;

        System.out.println("SOMA:" + sum);
        System.out.println("MÉDIA:" + average);

        sc.close();
    }
}
