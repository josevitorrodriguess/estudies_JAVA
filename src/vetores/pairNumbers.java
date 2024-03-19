package vetores;

import java.util.Scanner;

public class pairNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0;i<numbers.length;i++){
            System.out.println("Digite um número:");
            numbers[i] = sc.nextInt();
        }

        int pairCont = 0;

        System.out.println("NÚMEROS PARES:");
        for (int i = 0;i<numbers.length;i++){
            if (numbers[i]%2==0){
                System.out.printf("%d, ",numbers[i],"%n");
                pairCont++;
            }
        }
        System.out.println("QUANTIDADE DE PARES:"+ pairCont);

        sc.close();
    }
}
