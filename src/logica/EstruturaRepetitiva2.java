import java.util.Scanner;


public class EstruturaRepetitiva2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;

        System.out.println("Digite os valores de x e y no plano cartesiano:");
        x = sc.nextDouble();
        y = sc.nextDouble();
        sc.nextLine();

        sc.close();

        while(x!=0 || y != 0){
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
                break;
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
                break;
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
                break;
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
                break;
            }


        }
    }
}
