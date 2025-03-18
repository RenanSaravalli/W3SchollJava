package exercicios;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número para ver sua tabuada: ");
        int numero = read.nextInt();
        System.out.println("----------");
        for (int i = 0; i < 11; i++) {
            int resposta = numero * i;
            System.out.printf("%d x  %d = %d\n", numero, i, resposta);
        }
        System.out.println("----------");
    }
}
