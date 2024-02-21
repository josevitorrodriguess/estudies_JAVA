package poo.Produto;

import java.util.Locale;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueinStock(){

        return price*quantity;
    }

    public void addProducts(int qntToAdd){

        quantity += qntToAdd;
    }

    public void removeProducts(int qntToRemove){
        if (quantity >= qntToRemove) {
            quantity -= qntToRemove;
        } else {
            System.out.println("Not enough quantity in stock to remove.");
        }

    }

}
