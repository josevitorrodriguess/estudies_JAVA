import  java.util.Scanner;
public class EstruturaCondicional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número:");
        num = sc.nextInt();
        sc.close();

        if (num <0){
            System.out.println("O número digitado é negativo!");
        }else {
            System.out.println("O número digitado é positivo!");
        }

    }
}
