package introduction.matrizes;

public class RealExamplesMatrizes {
    public static void main(String[] args) {
        // Para demonstrar um exemplo prático de uso de matrizes, vamos criar um programa que
        // calcula a média de diferentes idades

        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;

        System.out.println("A idade média é: " + avg);
        // A idade média é: 40.75

        System.out.println();

        // Neste exemplo encontra a menor idade entre diferentes idades dado o array de cima

        int lowestAge = ages[0];

        for (int age : ages) {
            if (age < lowestAge) {
                lowestAge = age;
            }
        }

        System.out.println("A menor idade no array é: " + lowestAge);
        // A menor idade no array é: 18
    }
}
