package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.print("Primeiro Aluno: ");
        String aluno1 = read.next();
        System.out.print("Segundo Aluno: ");
        String aluno2 = read.next();
        System.out.print("Terceiro Aluno: ");
        String aluno3 = read.next();
        System.out.print("Quarto Aluno: ");
        String aluno4 = read.next();

        String[] listAlunos = {aluno1, aluno2, aluno3, aluno4};


        System.out.println("A ordem de apresentação será: ");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1)+ "- " + listAlunos[i]);
        }

    }
}
