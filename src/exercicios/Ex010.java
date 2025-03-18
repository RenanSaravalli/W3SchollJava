package exercicios;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Quanto de dinheiro você tem na carteira? R$");
        double dinheiro = read.nextDouble();
        double dolar = dinheiro / 5.68d;

        System.out.printf("Com R$%.2f você pode comprar US$%.2f", dinheiro, dolar);
    }
}
