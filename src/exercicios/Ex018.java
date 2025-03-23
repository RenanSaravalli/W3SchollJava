package exercicios;

import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o ângulo que você deseja: ");
        double angulo = read.nextDouble();

        double seno = Math.sin(angulo);
        double coss = Math.cos(angulo);
        double tang = Math.tan(angulo);

        System.out.printf("O ângulo de %.1f tem o SENO de %.2f\n", angulo, seno);
        System.out.printf("O ângulo de %.1f tem o COSSENO de %.2f\n", angulo, coss);
        System.out.printf("O ângulo de %.1f tem a TANGENTE de %.2f\n", angulo, tang);
    }
}
