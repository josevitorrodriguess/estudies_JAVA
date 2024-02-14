import java.util.Locale;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        System.out.println("Digite o valor de A:");
        A = sc.nextInt();

        System.out.println("Digite o valor de B:");
        B = sc.nextInt();

        System.out.println("Digite o valor de C:");
        C = sc.nextInt();

        System.out.println("Digite o valor de D:");
        D = sc.nextInt();

        sc.close();

        int diferenca = (A*B - C*D);

        System.out.println("A diferença dos produtos de A e B , e , C e D é: "+ diferenca);






    }
}