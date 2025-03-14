package introduction.matrizes;

public class LoopInMAtriz {
    public static void main(String[] args) {
        // Loop de matrizes em Java

        // Podemos percorrer os elementos da matriz com o for loop e usar a length propriedade
        // para especificar quantas vezes o loop deve ser executado.

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        /*Volvo, BMW, Ford, Mazda*/

        System.out.println();

        // Podemos utilizar o For-Each que exclusivamente é utilzado para percorrer elementos
        // em matrizes

        for (String car : cars) {
            System.out.println(car);
        }
        // Volvo, BMW, Ford, Mazda

    }
}
