package poo.produto;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class ConsultProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter product data:");
        System.out.println("Name:");
        String name = sc.nextLine();

        System.out.println("Price:");
        double price = sc.nextDouble();

        System.out.println("Quantity:");
        int quantity = sc.nextInt();

        Product produto = new Product(name, price, quantity);


        System.out.println("Product data: "+produto);

        System.out.println("Enter the number of products to be added in stock:");
        int add = sc.nextInt();
        produto.addProducts(add);
        System.out.println("Updated data: "+produto);


        System.out.println("Enter the number of products to be remove in stock:");
        int remove = sc.nextInt();
        produto.removeProducts(remove);
        System.out.println("Updated data: "+produto);


        sc.close();



    }
}
