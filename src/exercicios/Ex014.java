package exercicios;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Informe a temperatura em C: ");
        float tempCelsius = read.nextFloat();
        float tempFahrenheit = (float) (tempCelsius * 1.8) + 32;
        System.out.printf("A temperatura de %.1fC corresponde a %.1fF!\n", tempCelsius, tempFahrenheit);
    }
}
