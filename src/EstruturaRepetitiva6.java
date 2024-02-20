import java.util.Scanner;
import java.util.Locale;
public class EstruturaRepetitiva6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de vezes que os casos serão testados:");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("Digite os 3 números para tirarmos a média ponderada?");
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();
            sc.nextLine();

           double  mediaPonderada = ((n1*2)+(n2*3)+(n3*5))/10.0;

            System.out.printf("%.1f%n",mediaPonderada);
        }
    }
}
