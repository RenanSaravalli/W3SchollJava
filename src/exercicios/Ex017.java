package exercicios;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Comprimento do cateto oposto: ");
        float catOposto = read.nextFloat();

        System.out.printf("Comprimento do cateto adjacente: ");
        float catAdjacente = read.nextFloat();

        float c = (catOposto * catOposto) + (catAdjacente * catAdjacente);

        float hipotenusa = (float) Math.sqrt(c);

        System.out.println("A hipotenusa vai medir: " + hipotenusa);
    }
}
