package poo.mediaAlunos;

import java.util.Locale;
import java.util.Scanner;

public class CalculateMedia {
    public static void main (String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student aluno = new Student();

        System.out.println("What's student name:");
        aluno.nomeAluno = sc.nextLine();

        System.out.println("Put the student notes:");

        System.out.println("note 1(min 0/max 30):");
        aluno.nota1Trimestre = sc.nextDouble();

        System.out.println("note 2(min 0/max 35):");
        aluno.nota2Trimestre = sc.nextDouble();

        System.out.println("note 3(min 0/max 35):");
        aluno.nota3Trimestre = sc.nextDouble();

        double media = aluno.media();
        double qntFalta = 60.00 - media;

        if (media >= 60.00){
            System.out.printf("FINAL GRADE: %.2f%n PASS", media);
        }else {
            System.out.printf("FINAL GRADE: %.2f%n MISSING %.2f POINTS",media, qntFalta);
        }




    }
}
