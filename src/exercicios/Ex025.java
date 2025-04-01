package exercicios;

import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Qual é o seu nome completo? ");
        String nome = read.nextLine().strip().toLowerCase();
        boolean existe = false;
        String[] arrayNome = nome.split(" ");

        for (String valor : arrayNome) {
            if (valor.equals("silva")) {
                existe = true;
            }
        }

        System.out.println("Seu nome tem Silva? " + existe);
    }
}
