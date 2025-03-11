package exercicios;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome: ");
        String nome = ler.nextLine();
        System.out.print("Digite seu último nome: ");
        String sobreNome = ler.nextLine();
        System.out.println("Seu nome completo é: \n" + nome + " " + sobreNome);
    }
}
