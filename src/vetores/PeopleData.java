package vetores;

import java.util.Locale;
import java.util.Scanner;

public class PeopleData {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();

        char[] gender = new char[n];
        double[] height = new double[n];

        for (int i = 0;i<gender.length;i++){
            System.out.println("Altura da " + (i+1) + " Pessoa:");
            height[i] = sc.nextDouble();

            System.out.println("Genero da " + (i+1) + " Pessoa:");
            gender[i] = sc.next().charAt(0);
        }

        double greaterHeight = height[0];
        double shorterHeight = height[0];
        int manCont = 0;

        for (int i =0;i< gender.length;i++) {
            if (height[i]> greaterHeight){
                greaterHeight = height[i];
            }
        }
        for (int i =0;i< gender.length;i++) {
            if (height[i]< shorterHeight){
                shorterHeight = height[i];
            }
        }
        for (int i =0;i< gender.length;i++) {
            if (gender[i] == 'M'){
                manCont += 1;
            }
        }

        System.out.println("Menor Alura = %.2f%n" + shorterHeight);
        System.out.printf("Maior Alura = %.2f%n" , greaterHeight);
        System.out.println("Numero de homens = " + manCont );


    }
}
