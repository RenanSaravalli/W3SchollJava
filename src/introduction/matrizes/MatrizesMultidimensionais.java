package introduction.matrizes;

public class MatrizesMultidimensionais {
    public static void main(String[] args) {
        // Matrizes Multidimensionais Java

        /* Uma matriz multidimensional é uma matriz de matrizes.
           Elas são úteis quando queremos armazenar dados em formato tabular, como uma tabela
           com linhas e colunas.
           para criar uma matriz bidimensional, adicione cada matriz dentro de seu próprio
           conjunto de chaves:
        * */

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        // myNumbers agora é uma matriz com duas matrizes como elementos.

        // Elementos de acesso
        // Para acessar os elementos do array myNumbers, especifique dois índices: um para
        // o array e um para o elemento dentro daquele array. Este exemplo acessa o terceiro
        // elemento (2) no segundo array (1) de myNumbers

        System.out.println(myNumbers[1][2]);
        // Saída 7

        // Alterar valores dos elementos

        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);
        // Saída 9

        System.out.println();

        // Loop através de uma matriz multidimensional
        // Podemos usar um for loop dentro de outro for loop para obter os elementos de uma
        // matriz bidimensional (ainda temos que apontar p/ os dois índices)

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        } // 1, 2, 3, 4, 5, 6, 9

        System.out.println();

        // Podemos utilizar o for-each
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        } // 1, 2, 3, 4, 5, 6, 9
    }
}
