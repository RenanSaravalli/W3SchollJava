package exercicios;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Qual é o salário do funcionário? R$");
        float salBrutoFuncionario = read.nextFloat();
        float aumento = 15;
        float salLiquidoFuncionario =  salBrutoFuncionario + (salBrutoFuncionario * aumento / 100);
        System.out.printf("Um funcionário que ganhava R$%.2f, com %.0f%% de aumento, passa a receber R$%.2f\n", salBrutoFuncionario, aumento, salLiquidoFuncionario);
    }
}
