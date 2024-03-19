package vetores;

import jdk.jshell.execution.LoaderDelegate;

import java.util.Locale;
import java.util.Scanner;

public class PeopleHeights {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num = 1;

        System.out.println("Quantos pessoas serao digitadas?");
        int n = sc.nextInt();

        String[] name = new String[n];
        double[] heigh = new double[n];
        int[] age = new int[n];

        for (int i = 0; i < name.length; i++) {
            System.out.println("Dados da " + num + " Pessoa:");
            System.out.println("Nome:");
            name[i] = sc.next();
            System.out.println("Altura:");
            heigh[i] = sc.nextDouble();
            System.out.println("Idade:");
            age[i] = sc.nextInt();
            num++;
        }

        double heighSum = 0;
        for (int i = 0; i < name.length; i++) {
            heighSum += heigh[i];
        }
        double heighAvarage = heighSum / n;
        System.out.printf("Altura média: %.2f%n", heighAvarage,"%");

        int cont = 0;
        for (int i = 0; i<age.length;i++){
            if(age[i]<16){
                cont++;
            }
        }
        double percentage = (double) cont/age.length*100;



        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentage);


        for (int i = 0; i<age.length;i++){
            if(age[i]<16){
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}
