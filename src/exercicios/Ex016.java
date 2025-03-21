package exercicios;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float numero = read.nextFloat();

        int parteInteira = (int) numero;

        System.out.printf("O número: %.3f tem a parte inteira: %d\n", numero, parteInteira);
    }
}
