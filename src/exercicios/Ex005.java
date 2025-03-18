package exercicios;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = read.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.printf("Analisando o valor: %d, seu antecessor é %d, e o sucessor é %d", numero, antecessor, sucessor);
    }
}
