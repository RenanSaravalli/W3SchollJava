package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random indexSorteado = new Random();

        System.out.print("Primeiro Aluno: ");
        String aluno1 = read.next();
        System.out.print("Segundo Aluno: ");
        String aluno2 = read.next();
        System.out.print("Terceiro Aluno: ");
        String aluno3 = read.next();
        System.out.print("Quarto Aluno: ");
        String aluno4 = read.next();

        String[] listAlunos = {aluno1, aluno2, aluno3, aluno4};
        String alunoSorteado = listAlunos[indexSorteado.nextInt(4)];

        System.out.println("O aluno(a) escolhido foi " + alunoSorteado);
    }
}
