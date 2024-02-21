package poo.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os lados do triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite os lados do triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        sc.nextLine();


        double areaX = x.area();
        double areaY = y.area();


        System.out.printf("área do triangulo X: %.4f%n",areaX);
        System.out.printf("área do triangulo Y: %.4f%n",areaY);


        if (areaX>areaY){
            System.out.printf("Maior àrea X: %.4f%n",areaX);
        }else {
            System.out.printf("Maior àrea Y: %.4f%n",areaY);
        }


        sc.close();
    }
}
