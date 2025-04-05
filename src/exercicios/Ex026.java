package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args) {
        Scanner read = new  Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = read.nextLine().strip().toLowerCase();
        String[] fraseArray = frase.split("");


        System.out.println("A letra A aparece " + contadorDeA(fraseArray) + " vezes na frase");
        System.out.println("A primeira letra A apareceu na posição: " + encontrarPrimeiroA(fraseArray));
        System.out.println("A última letra A apareceu na posição: " + encontrarUltimoA(fraseArray));
    }

    static int encontrarPrimeiroA(String[] frase) {
        for (int i = 0; i < frase.length; i++) {
            if (frase[i].equals("a")) {
                return i + 1;
            }
        }
        return -1;
    }

    static int contadorDeA(String[] frase) {
        int contLetraA = 0;
        for (int i = 0; i < frase.length; i++) {
            if (frase[i].equals("a")) {
                contLetraA++;
            }
        }
        return contLetraA;
    }

    static int encontrarUltimoA(String[] frase) {
        int ultimoA = 0;
        for (int i = 0; i < frase.length; i++) {
            if (frase[i].equals("a")) {
                ultimoA = i + 1;
            }
        }
        return ultimoA;
    }
}
