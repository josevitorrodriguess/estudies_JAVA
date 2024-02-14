import java.util.Locale;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario, horasTrabalhadas;
        double valorHora;

        System.out.println("Digite o número do funcionário:");
        numFuncionario = sc.nextInt();

        System.out.println("Digite a quantidades de horas trabalhadas por ele:");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor da hora trabalhada deste funcionário:");
        valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;


        System.out.println("Number: "+numFuncionario+"\nSalary:"+salario);






    }
}