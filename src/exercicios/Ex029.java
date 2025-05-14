package exercicios;

import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Qual é a velocidade atual do carro? ");
        int velocidade = read.nextInt();
        int velocidadeMaxima = 80;
        if (velocidade <= velocidadeMaxima) {
            System.out.println("Tenha um Bom dia! Dirija com segurança!!");
        } else {
            int diferencaDeVelocidade = velocidade - velocidadeMaxima;
            float valorMulta = diferencaDeVelocidade * 7;
            System.out.println("Multado!! Você excedeu o limite permitido que é de 80km/h");
            System.out.printf("Você deve pagar uma multa de R$%.2f\n",valorMulta);
            System.out.print("Tenha um Bom dia e dirija com segurança!");
        }
    }
}

