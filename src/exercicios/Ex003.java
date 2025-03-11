package exercicios;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = read.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = read.nextInt();
        int soma = n1 + n2;
        System.out.printf("A soma dos números: %d + %d é igual: %d", n1, n2, soma);
    }
}
