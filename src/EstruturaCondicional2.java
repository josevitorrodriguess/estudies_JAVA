import  java.util.Scanner;
public class EstruturaCondicional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número:");
        num = sc.nextInt();
        sc.close();

        if (num%2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é ímpar");
        }

    }
}
