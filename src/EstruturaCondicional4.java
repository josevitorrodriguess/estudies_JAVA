import java.util.Scanner;

public class EstruturaCondicional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal;

        System.out.println("Digite os horario de inicio  do jogo:");
        horaInicial = sc.nextInt();

        System.out.println("Digite os horario do fim do jogo:");
        horaFinal = sc.nextInt();
        sc.close();

        int duração;

        if (horaInicial < horaFinal){
            duração = horaFinal - horaInicial;
            System.out.println("O jogo durou:"+duração+" horas");
        } else if (horaInicial == 0 && horaFinal == 0) {
            System.out.println("O jogo durou 24 horas");
        } else if (horaFinal < horaInicial) {
            duração = 24 - horaInicial + horaFinal;
            System.out.println("O jogo durou:"+duração+" horas");

        }


    }
}
