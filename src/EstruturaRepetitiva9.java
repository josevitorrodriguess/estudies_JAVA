import java.util.ArrayList;
import java.util.Scanner;

public class EstruturaRepetitiva9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> divisores = new ArrayList<>();

        System.out.println("digite um numero para calcularmos seus divisores:");
        int numero = sc.nextInt();


        for (int i =1;i<numero;i++){
           if (numero%i==0){
               divisores.add(i);
           }

        }
        divisores.add(numero);
        System.out.println(divisores);
    }

}
