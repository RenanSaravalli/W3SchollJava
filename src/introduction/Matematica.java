package introduction;

public class Matematica {
    public static void main(String[] args) {
        // A classe Java Math tem muitos métodos que permitem executar tarefas mat em nums

        // Métd p/ encontrar o maior valor de x e y
        System.out.println(Math.max(10, 5));    // 10

        // Métd p/ encontrar o menor valor de x e y
        System.out.println(Math.min(10, 5));    // 5

        // Métd retorna a raiz quadrada
        System.out.println(Math.sqrt(64));

        // Métd retorna o valor absoluto (positivo) Math.abs()
        System.out.println(Math.abs(-4.7));

        // Métd retorna um num aleatório entre 0 (inclusive) e 1,0 exclusivo
        System.out.println(Math.random()); // 0.9399922579889426

        // Para ter mais controle sobre o num aleatório, por ex, se vc quiser apenas
        // um num aleatório entre 0 e 100:
        int numRandom = (int)(Math.random() * 101);
        System.out.println(numRandom); // 0 to 100 // -> print(65)


    }
}
