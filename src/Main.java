import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String escolhaJogador;
        String escolhaComputador;
        String respostaJogador = "sim";
        String[] escolhas = {"pedra", "papel", "tesoura"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while(respostaJogador.equals("sim")){
            System.out.print("Escolha uma opção (pedra, papel, tesoura): ");
            escolhaJogador = scanner.nextLine().toLowerCase();

            escolhaComputador = escolhas[random.nextInt(3)];
            System.out.println("Escolha do computador: " + escolhaComputador);


            if(escolhaJogador.equals(escolhaComputador)) {
                System.out.println("Empate!");
            } else if(escolhaJogador.equals("pedra") && escolhaComputador.equals("tesoura")){
                System.out.println("Voce venceu!");
            } else if(escolhaJogador.equals("pedra") && escolhaComputador.equals("papel")) {
                System.out.println("Voce perdeu!");
            } else if(escolhaJogador.equals("papel") && escolhaComputador.equals("tesoura")){
                System.out.println("Voce perdeu!");
            } else if(escolhaJogador.equals("papel") && escolhaComputador.equals("pedra")) {
                System.out.println("Voce venceu!");
            } else if(escolhaJogador.equals("tesoura") && escolhaComputador.equals("papel")) {
                System.out.println("Voce venceu!");
            } else if(escolhaJogador.equals("tesoura") && escolhaComputador.equals("pedra")) {
                System.out.println("Voce perdeu!");
            } else {
                System.out.println("Opção invalida");
            }

            System.out.print("Jogar novamente? (sim/não): ");
            respostaJogador = scanner.nextLine();
        }

        System.out.println("Obrigada por jogar!");
    }
}
