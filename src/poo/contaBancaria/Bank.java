package poo.contaBancaria;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankMethods account = new BankMethods();

        System.out.println("Enter account number:");
        account.setAccountNumber(sc.nextInt());

        System.out.println("Enter account holder:");
        account.setTitularName(sc.next());

        System.out.println("Is a there initial deposit (y/n):");
        String response = sc.next();

        if (response.equals("y")){
            System.out.println("Enter a initial deposit value:");
            account.setBalance(sc.nextDouble());
        }else{
            account.getBalance();
        }

        System.out.println("Account data:");
        System.out.println(account.toString());

        System.out.println("Enter a deposit value:");
        account.deposit(sc.nextDouble());

        System.out.println("Account data:");
        System.out.println(account.toString());

        System.out.println("Enter a withdraw value:");
        account.sake(sc.nextDouble());

        System.out.println("Account data:");
        System.out.println(account.toString());



    }
}
