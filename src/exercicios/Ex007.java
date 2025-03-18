package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);
        System.out.println("Primeira nota do aluno: ");
        float n1 = read.nextFloat();
        System.out.println("Segunda nota do aluno: ");
        float n2 = read.nextFloat();

        float mediaNota = (n1 + n2) / 2;

        System.out.printf("A média entre %.1f e %.1f é igual a %.1f", n1, n2, mediaNota);
    }
}
