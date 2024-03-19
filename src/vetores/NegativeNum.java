package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        while (n<=0 || n>10) {
           System.out.println("Quantidade invalida, digite um número maior que zero e no máximo até 10!" +
                   "\n Digite novamente:");n = sc.nextInt();

        }

        int[] vect = new int[n];

        for (int i =0; i <vect.length;i++){
            System.out.println("Digite um número:");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i =0; i <vect.length;i++){
            if (vect[i] <0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
