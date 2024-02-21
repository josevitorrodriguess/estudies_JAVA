package poo.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ConsultProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product produto = new Product();

        System.out.println("Enter product data:");
        System.out.println("Name:");
        produto.name = sc.nextLine();

        System.out.println("Price:");
        produto.price = sc.nextDouble();

        System.out.println("Quantity:");
        produto.quantity = sc.nextInt();

        double total = produto.totalValueinStock();

        System.out.printf("Product data: %s, R$: %.2f, %d units, Total:%.2f%n",produto.name,produto.price,produto.quantity,total);

        System.out.println("Enter the number of products to be added in stock:");
        int add = sc.nextInt();
        produto.addProducts(add);
        total = produto.totalValueinStock();
        System.out.printf("Update data: %s, R$: %.2f, %d units, Total:%.2f%n",produto.name,produto.price,produto.quantity,total);


        System.out.println("Enter the number of products to be remove in stock:");
        int remove = sc.nextInt();
        produto.removeProducts(remove);
        total = produto.totalValueinStock();
        System.out.printf("Update data: %s, R$: %.2f, %d units, Total:%.2f%n",produto.name,produto.price,produto.quantity,total);


        sc.close();

    }
}
