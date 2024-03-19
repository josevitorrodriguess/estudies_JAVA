package vetores;

import java.util.Locale;
import java.util.Scanner;

public class HighestPosition {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        for (int i =0; i <numbers.length;i++){
            System.out.println("Digite um número:");
            numbers[i] = sc.nextDouble();
        }

        double highestNumber = numbers[0];
        int position =0;

        for (int i = 0; i< numbers.length;i++){
            if (numbers[i]> highestNumber){
                highestNumber = numbers[i];
                position = i;
            }
        }

        System.out.println("Maior Valor:" + highestNumber);
        System.out.println("Posição do maior valor:" + position);


        sc.close();
    }
}
