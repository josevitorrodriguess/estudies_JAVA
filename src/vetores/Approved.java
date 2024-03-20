package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Approved {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos você vai digitar:");
        int n = sc.nextInt();


        String[] name = new String[n];
        double[] grade1 = new double[n];
        double[] grade2 = new double[n];


        int cont = 1;

        for (int i = 0; i < grade1.length; i++) {
            System.out.println("Dados do " + cont + " aluno:");
            System.out.println("Nome:");
            name[i] = sc.next();


            System.out.println("1°Nota:");
            grade1[i] = sc.nextDouble();

            System.out.println("2°Nota:");
            grade2[i] = sc.nextDouble();

            cont++;
        }

        System.out.println("Alunos aprovados");
        for (int i =0;i<grade1.length;i++){
            double media = (grade1[i] + grade2[i])/2;
            if (media>=6.0){
                System.out.println(name[i]);
            }
        }
    }
}
