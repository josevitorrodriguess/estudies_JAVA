import java.util.Locale;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


       double raio;

        System.out.println("Digite o raio do círculo:");

        raio = sc.nextDouble();
        sc.close();

        double area = 3.14159 * (raio*raio);

        System.out.printf("A área do circulo é: %.4f%n ", area);



    }
}
