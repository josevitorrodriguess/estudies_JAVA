package poo.dadosFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class SeeFuncData {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee funcionario = new Employee();

        System.out.println("Type it funcionary informations:");
        System.out.println("Name:");
        funcionario.name = sc.nextLine();

        System.out.println("Gross salary:");
        funcionario.grossSalary = sc.nextDouble();

        System.out.println("Tax:");
        funcionario.tax = sc.nextDouble();

        System.out.println(funcionario.toString());

        System.out.println("Which percentage to increase salary:");
        funcionario.increaseSalary(sc.nextDouble());

        System.out.println("Updated data:" + funcionario.toString());

        sc.close();

    }
}
