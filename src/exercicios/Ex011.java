package exercicios;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite a largura da parede: ");
        float largParede = read.nextFloat();

        System.out.println("Digite a Altura da parede: ");
        float alturaParede = read.nextFloat();

        float area = largParede * alturaParede;

        float litrosDeTinta = area / 2;

        System.out.printf("Sua parede tem a dimensão %.1fx%.1f e sua área é: %.2fm2\n", largParede, alturaParede, area);
        System.out.printf("Para printar essa parede, você precisará de %.4fl de tinta\n", litrosDeTinta);
    }
}
