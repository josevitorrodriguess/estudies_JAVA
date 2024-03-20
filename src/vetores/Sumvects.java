package vetores;

import java.util.Scanner;

public class Sumvects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor:");
        int values = sc.nextInt();

        int[] vectA = new int[values];
        int[] vectB = new int[values];

        for (int i = 0; i <vectA.length;i++){
            System.out.println("Digite um valor para adicionar no vetor A:");
            vectA[i] = sc.nextInt();
        }

        for (int i = 0; i <vectB.length;i++){
            System.out.println("Digite um valor para adicionar no vetor B:");
            vectB[i] = sc.nextInt();
        }


        int[] vectC = new int[vectA.length];

        for (int i = 0; i <vectA.length;i++){
            vectC[i] = vectA[i] + vectB[i];

        }

        for (int i = 0; i<vectC.length;i++) {
            System.out.println(vectC[i]);
        }
    }
}



