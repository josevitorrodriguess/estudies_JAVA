import java.util.Scanner;
import java.util.Locale;

public class EstruturaCondicional8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario;

        System.out.println("Digite seu salário para calcularmos o seu imposto de renda:");
        salario = sc.nextDouble();
        sc.close();

        double imposto;

        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Isento");
        }
        else if (salario >= 2000.01 && salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$: %.2f", imposto);
        }
        else if (salario >= 3000.01 && salario <= 4500.00) {
            imposto = (salario - 3000) * 0.18 + 1000.00 *0.08;
            System.out.printf("R$: %.2f", imposto);
        }
        else if (salario > 4500) {
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$: %.2f", imposto);
        }
    }
}
