import java.util.Scanner;

public class EstruturaCondicional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite dois números para saber se são multiplos entre si:");
        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = sc.nextInt();
        sc.close();

        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("São multiplos entre si");
        }
        else{
            System.out.println("Não são multiplos entre si");
        }



    }
}
