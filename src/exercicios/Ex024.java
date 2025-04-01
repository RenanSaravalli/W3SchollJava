package exercicios;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Em que cidade você nasceu? ");
        String cidade = read.nextLine().strip().toLowerCase();
        // Strip remove os espaços iniciais e finais de uma string;
        // toLowerCase() -> Para deixar td em minúsculo


        String[] arrayCidade = cidade.split(" ");


        System.out.println((arrayCidade[0].equals("santo")));

        System.out.println("--------------------");

        // Realizando de outro métod utilizando startsWith e endsWith

        System.out.println(cidade.startsWith("santo"));
    }
}
