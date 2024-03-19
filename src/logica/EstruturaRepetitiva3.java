import java.util.Scanner;


public class EstruturaRepetitiva3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contCombustivel;
        int contGasolina = 0;
        int contDisel = 0;
        int contAlcool = 0;

        System.out.println("1:Álcool\n 2:Gasolina\n 3:Disel\n 4:Fim\n Qual combustivel você irá abastecer:");
        contCombustivel = sc.nextInt();

        while (contCombustivel != 4){
            switch (contCombustivel){
                case  1:
                    contAlcool = contAlcool + 1;
                    break;
                case  2:
                    contGasolina = contGasolina + 1;
                    break;
                case  3:
                    contDisel = contDisel + 1;
                    break;
                default:
                    System.out.println("Digite um código valido!");

            }
            System.out.println("1:Álcool\n 2:Gasolina\n 3:Disel\n 4:Fim\n Qual combustivel você irá abastecer:");
            contCombustivel = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO!!\nÁlcool: "+contAlcool+"\nGasolina: "+contGasolina+"\nDisel: "+contDisel);





    }
}
