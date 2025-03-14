package introduction.matrizes;

public class matrizesJv {
    public static void main(String[] args) {
        // MATRIZES JAVA

        /* Matrizes são usadas para armazenas vários valores em uma única variável, em vez
           de declarar variáveis separadas para cada valor
        * */
        // Para declarar um array, defina o tipo de variável com colchetes

        // String[] minhaMatriz;

        // Agora declaramos uma variável que contém um array de strings, Para inserir
        // valores nela, vc pode colocar os valores em uma lista separada por vírgulas,
        // dentro de chaves

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Para criar uma matriz de inteiros

        // int[] myNum = {10, 20, 30, 40};

        // Acessando os elementos de uma Matriz

        // Podemos acessar os elementos de uma matriz consultando o número do índice
        // Esta declaração acessa o valor do primeiro elemento em carros

        System.out.println(cars[0]); // Volvo

        // Alterar um elemento de matriz

        cars[0] = "Opel";
        System.out.println(cars[0]); // Opel

        // Comprimento da Matriz
        // Para descobrir quantos elementos uma matriz possui, usamos a length propriedade

        System.out.println(cars.length);
        // Saída: 4
    }
}
