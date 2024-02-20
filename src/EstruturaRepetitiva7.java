import java.util.Scanner;
import java.util.Locale;
public class EstruturaRepetitiva7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int n = sc.nextInt();


        for (int i=1; i<=n;i++){
            System.out.println("Digite 2 números para vermos a divisão:");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            sc.nextLine();

                if (num2 == 0){
                    System.out.println("Divisão impossivel");
            }else{
                    System.out.println(num1/num2);
                }
        }
    }
}
