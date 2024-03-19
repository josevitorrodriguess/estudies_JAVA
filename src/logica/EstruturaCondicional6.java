import java.util.Scanner;
import java.util.Locale;
public class EstruturaCondicional6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double num;

        System.out.println("Digite um valor:");
        num = sc.nextDouble();
        sc.close();

        if (num>=0 && num<=25){
            System.out.println("O número está no intervalo entre 0 e 25");
        } else if (num >=25.01 && num <=50) {
            System.out.println("O número está no intervalo entre 25 e 50");
        }else if (num >= 50.01 && num <=75){
            System.out.println("O número está no intervalo entre 50 e 75");
        } else if (num>=75.01 && num <=100) {
            System.out.println("O número está no intervalo entre 75 e 100");
        }else {
            System.out.println("O número está fora do intervalo;");
        }


    }
}
