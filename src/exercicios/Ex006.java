package exercicios;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = read.nextInt();

        int dobro = numero * 2;
        int triplo = numero * 3;
        double raizQuad =  Math.sqrt(numero);

        System.out.printf("O dobro de %d vale %d\n", numero, dobro);
        System.out.printf("O triplo de %d vale %d\n", numero, triplo);
        System.out.printf("A raiz quadrada de %d é igual a %.2f\n", numero, raizQuad);

    }
}
