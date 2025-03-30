package exercicios;

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int numero = read.nextInt();

        System.out.println("Analizando o número: " + numero);

        int u = numero / 1 % 10;
        int d = numero / 10 % 10;
        int c = numero / 100 % 10;
        int m = numero / 1000 % 10;

        System.out.println("Unidade: " + u);
        System.out.println("Dezena: " + d);
        System.out.println("Centena: " + c);
        System.out.println("Milhar: " + m);
    }
}
