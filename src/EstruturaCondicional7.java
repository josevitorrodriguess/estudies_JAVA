import java.util.Scanner;
import java.util.Locale;
public class EstruturaCondicional7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Digite o valor de x no plano:");
        x = sc.nextDouble();

        System.out.println("Digite o valor de y no plano:");
        y = sc.nextDouble();
        sc.close();

        if (x>0 && y>0){
            System.out.println("Q1");
        } else if (x<0 && y<0) {
            System.out.println("Q3");
        } else if (x>0 && y<0) {
            System.out.println("Q4");
        } else if(x<0 && y>0){
            System.out.println("Q2");
        } else if (x == 0 && y == 0) {
            System.out.println("Origem");
        }


    }
}
