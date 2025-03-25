package introduction.metodos;

public class RecursãoJv {
    public static void main(String[] args) {
        // Recursão é a técnica de fazer uma função chamar a si mesma. Essa técnica fornece
        // uma maneira de quebrar problemas complicados em problemas simples que
        // são mais fáceis de resolver.

        // Exemplo de recursão
        // Adicionar dois números é fácil, mas adicionar um intervalo de nums é mais
        // complicado. No exemplo a seguir a recursão é usada p/ adicionar um intervalo
        // de números dividindo-o na tarefa simples de adicionar dois números:
        int result = sum(10);
        System.out.println(result);

        // Exemplo explicado: Quando a função sum() é chamada, ela adiciona parâmetro k
        // à soma de todos os números menores que k e retorna o resultado. Quando k se torna 0,
        // a função retorna apenas 0.
        // Como a função não chama a si mesma quando k é 0, o programa para ali e retorna o
        // resultado

        // Condição de parada
        // toda função recursiva teve ter a condição de parada -> a condição em que a função
        // para de chamar a si mesma.
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
