package vetores;

import java.util.Scanner;

public class Older {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos pessoas você vai digitar:");
        int n = sc.nextInt();

        int[] age = new int[n];
        String[] name = new String[n];

        int cont = 1;
        for (int i = 0; i < age.length; i++) {
            System.out.println("Dados da " + cont + " pessoa:");
            System.out.println("Nome:");
            name[i] = sc.next();

            System.out.println("Idade:");
            age[i] = sc.nextInt();
            cont++;
        }

        int olderAge = 0;


        String olderPerson = null;
        for (int i = 0; i < age.length; i++) {
            if (age[i] > olderAge) {
                olderAge = age[i];
                olderPerson = name[i];
            }
        }

        System.out.println("Pessoa mais velha: " + olderPerson);
    }
}
