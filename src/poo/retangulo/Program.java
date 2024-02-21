package poo.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();

        System.out.println("Informe os valores da largura e altura do retângulo:");

        retangulo.width = sc.nextDouble();
        retangulo.heigh = sc.nextDouble();
        sc.nextLine();

        System.out.println(retangulo.toString());


        sc.close();

    }
}
