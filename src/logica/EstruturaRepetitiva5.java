import java.util.Scanner;

public class EstruturaRepetitiva5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a quantidade de números que serão lidos:");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;
        for (int i =1;i<=n;i++){
            System.out.println("Digite um número:");
            int numero = sc.nextInt();

            if (numero>10 && numero<20){
                in++;

            }else{
                out++;

            }
        }
        System.out.println(in+" in\n"+out+" out");

        sc.close();
    }
}
