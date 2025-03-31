package exercicios;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Em que cidade você nasceu? ");
        String cidade = read.nextLine();

        String cidadeLower = cidade.toLowerCase();

        String[] arrayCidade = cidadeLower.split(" ");

        System.out.println((arrayCidade[0].equals("santo")));
    }
}
