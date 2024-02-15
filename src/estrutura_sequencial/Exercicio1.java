import java.util.Scanner;
//exercicio1
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;



        System.out.println("Digite um número:");
        num1 = sc.nextInt();

        System.out.println("Digite outro número:");
        num2 = sc.nextInt();
        sc.close();

        int soma = num1 + num2;

        System.out.println("A soma dos dois números é: "+soma);


    }
}
