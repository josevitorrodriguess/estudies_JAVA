import java.util.ArrayList;
import java.util.Scanner;

public class EstruturaRepetitiva10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o número de linhas:");
        int linha = sc.nextInt();

        for (int i=1;i<=linha;i++){
            int num1 = i;
            int num2 = i*i;
            int num3 = i*i*i;
            System.out.printf("%d %d %d%n",num1,num2,num3);
        }
    }

}
