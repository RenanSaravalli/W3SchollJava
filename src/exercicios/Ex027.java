package exercicios;

import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = read.nextLine().strip();
        String[] nomeCompletoArray = nomeCompleto.split(" ");

        System.out.println("Muito prazer em te conhecer!");
        System.out.println("Seu primeiro nome é " + nomeCompletoArray[0]);
        System.out.println("Seu último nome é " + ultimoElementoArray(nomeCompletoArray));
    }

    static String ultimoElementoArray(String[] array) {
        String ultimoElemento = array[array.length -1];
        return ultimoElemento;
    }
}
