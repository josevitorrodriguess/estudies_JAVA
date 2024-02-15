import java.util.ArrayList;
import java.util.Scanner;

public class EstruturaCondicional5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont;
        int lanche;
        ArrayList<Integer> conta = new ArrayList<>();

        double[] precos = {4.00, 4.50, 5.00, 2.00, 1.50};

        System.out.println("Lanches\n Cod: 1 Cachorro quente:R$ 4.00 \n Cod: 2 X-salada:R$ 4.50\n Cod:3 X-Bacon:R$ 5.00\n " +
                "Cod:4 Torrada Simples:R$ 2.00\n Cod:5 Refrigerante:R$ 1.50");


        do {
            System.out.println("Qual lanche você irá querer?\n Digite o Código:");
            lanche = sc.nextInt();

            if (lanche >= 1 && lanche <= 5){
                conta.add(lanche);
            }
            else{
                System.out.println("Código invalido, digite um código válido");
            }
            System.out.println("Vai querer mais alguma coisa?(sim/nao)");
            cont = sc.next();
        }   while (cont.equalsIgnoreCase("sim") || cont.equalsIgnoreCase("s"));

        double total = 0.00;

        for (int codigo : conta){
            total += precos[codigo - 1];

        }
        System.out.println("Total da conta: R$" + total);

        sc.close();




    }
}
