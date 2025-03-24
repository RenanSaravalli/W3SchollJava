package exercicios;

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = read.nextLine();
        System.out.println("Analisando seu nome...");
        String nomeUpper = nome.toUpperCase();
        String nomeLower = nome.toLowerCase();
        String[] nomeSeparado = nome.split(" ");
        int tamanhoNome = 0;
        for (int i = 0; i < nomeSeparado.length; i++) {
            tamanhoNome += nomeSeparado[i].length();
        }
        String primeiroNome = nomeSeparado[0];
        int tamanhoPrimeiroNome = nomeSeparado[0].length();

        System.out.println("Seu nome em maiúsculas é " + nomeUpper);
        System.out.println("Seu nome em minúsculas é " + nomeLower);
        System.out.println("Seu nome tem ao todo " + tamanhoNome + " letras");
        System.out.println("Seu primeiro nome é " + primeiroNome + " e ele tem " + tamanhoPrimeiroNome + " letras");


    }
}
/* OBS o next pega um caractere até um espaço
   o nextLine pega a linha inteira mesmo com espaço
* */