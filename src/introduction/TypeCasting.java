package introduction;

public class TypeCasting {
    public static void main(String[] args) {
        /*  A conversão de tipo ocorre quando você atribui um valor
            de um tipo de dado primitivo a outro tipo.

            Ampliação de fundição (automaticamente) -
            convertendo um tipo menor em um tamanho de tipo maior
            byte -> short -> char -> int -> long -> float -> double

            Estreitamento de fundição (manualmente) -
            convertendo um tipo maior em um tipo de tamanho menor
            double -> float -> long -> int -> char -> short -> byte
        * */

        // Convertendo passando um tipo de tamanho menor p/ um tipo de tamanho maior:

        int myInt = 9;
        double myDouble = myInt; // Conversão Automática int -> double

        System.out.println(myInt);      // 9
        System.out.println(myDouble);   // 9.0

        System.out.println();

        // Convertendo manualmente colocando o tipo entre parênteses () antes do valor

        double myDouble2 = 9.79d;
        int myInt2 = (int) myDouble2; // Conversão manual double -> int

        System.out.println(myDouble2);  // 9.79
        System.out.println(myInt2);     // 9

        System.out.println();

        /*  Exemplo de utilização na vida real
            Criamos um programa para calcular a porcentagem da pontuação de um usuário
            em relação à pontuação máxima em um jogo.
            Usamos a conversão de tipo p/ garantir que o resultado seja um valor de ponto
            flutuante, em vez de um inteiro.
        * */

        // GAME

        int maxScore = 500;
        int userScore = 423;

        // Calculando a porcentagem de pontuação do usuário em relação ao máximo de pontuação
        // Vamos converter userScore para garantir que a conversão seja precisa.

        float porcentagem = (float) userScore / maxScore * 100.f;

        System.out.println("Porcentagem usuário: " + porcentagem); // 84.6
    }
}
