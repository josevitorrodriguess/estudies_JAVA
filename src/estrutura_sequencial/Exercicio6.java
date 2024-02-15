import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        System.out.println("Digite os valores de A, B e C:");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        sc.nextLine();

        sc.close();

        double areaTriangulo = 0.5 * A * C;
        double areaCirculo = Math.PI * Math.pow(C, 2);
        double areaTrapezio = 0.5 * (A + B) * C;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;
        System.out.printf("As áreas são:\nTriângulo: %.3f\nCírculo: %.3f\nTrapézio: %.3f\nQuadrado: %.3f\nRetângulo: %.3f%n",
                areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
    }
}
