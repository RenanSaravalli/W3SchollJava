package exercicios;

import java.util.Scanner;
import java.util.Timer;

public class Ex028 {
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        Timer tempo = new Timer();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Vou pensar em um número entre 0 e 5. Tente adivinhar...");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        int numeroRandom = (int)(Math.random() * 6);

        System.out.print("Em que número eu pensei? ");
        int chute = read.nextInt();

        System.out.println("Processando!!");
        Thread.sleep(1000);

        if (chute == numeroRandom) {
            System.out.println("PERDI!! Você acertou o número!!");
        } else {
            System.out.println("HAHAHA Ganhei Você não acertou o número!!");
        }

        System.exit(0);
    }
}
