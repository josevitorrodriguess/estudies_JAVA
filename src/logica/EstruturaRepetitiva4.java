import java.util.Scanner;

public class EstruturaRepetitiva4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x para mostrar os números impares menor que ele:");
        int x = sc.nextInt();

        for (int i=1;i<=x;i++){
            if (i % 2 != 0){
                System.out.println(i +"\n");
            }
        }
        sc.close();

    }
}
