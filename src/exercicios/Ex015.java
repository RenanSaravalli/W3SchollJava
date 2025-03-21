package exercicios;

import java.util.Scanner;
 // 60 por dia | 0,15 por km
public class Ex015 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Quantos dias alugados? ");
        int diasAlugados = read.nextInt();
        System.out.print("Quantos Km rodados? ");
        float kmRodados = read.nextFloat();

        float precoTotalDias = diasAlugados * 60;
        float precoTotalKm = kmRodados * 0.15f;
        float valorTotalAluguelCar = precoTotalKm + precoTotalDias;
        System.out.printf("O total a pagar é de R$%.2f\n",valorTotalAluguelCar);
    }
}
