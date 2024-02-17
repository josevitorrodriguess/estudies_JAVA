import java.util.Scanner;


public class EstruturaRepetitiva1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contCombustivel;
        int contGasolina = 0;
        int contDisel = 0;
        int contAlcool = 0;

        System.out.println("Qual combustivel você irá abastecer:\n 1:Álcool\n 2:Gasolina\n 3:Disel\n 4:Fim");
        contCombustivel = sc.nextInt();

        while (contCombustivel != 4){
            switch (contCombustivel){
                case  1:
                    contAlcool =+ 1;
                    break;
                case  2:
                    contGasolina =+ 1;
                    break;
                case  3:
                    contDisel =+ 1;
                    break;

            }



        }






    }
}
