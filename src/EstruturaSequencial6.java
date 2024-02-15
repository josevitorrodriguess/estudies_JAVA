import java.util.Locale;
import java.util.Scanner;
public class EstruturaSequencial6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, numPeca1, codigoPeca2, numPeca2;
        double valorPeca1, valorPeca2;

        System.out.println("Digite o Código da peça 1, o numero e seu valor:");
        codigoPeca1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o Código da peça 2, o numero e seu valor:");
        codigoPeca2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();
        sc.nextLine();

        sc.close();

        double totalPeca1 = numPeca1 * valorPeca1;
        double totalPeca2 = numPeca2 * valorPeca2;

        System.out.println("Total a pagar:"+ (totalPeca1 + totalPeca2));









    }
}