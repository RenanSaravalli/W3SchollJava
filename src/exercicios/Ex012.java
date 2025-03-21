package exercicios;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Qual é o preco do produto? R$");
        float precoProduto = read.nextFloat();
        float desconto = 5f;
        float precoComDesconto = precoProduto - ((precoProduto * desconto / 100));
        System.out.printf("O produto que custava: R$%.2f, na promoção com desconto de %.0f%% vai custar R$%.2f\n", precoProduto, desconto, precoComDesconto);
    }
}
