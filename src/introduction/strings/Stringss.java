package introduction.strings;

public class Stringss {
    public static void main(String[] args) {
        // Comprimento de uma String
        String txt = "ABCDEFGPALMEIRAS";
        System.out.println("O tamanho da String: " + txt.length()); // 16
        System.out.println();

        /* Mais métodos de String:
           toUpperCase();
           toLowerCase();  */
        String testo = "Hello World";
        System.out.println(testo.toUpperCase());    // HELLO WORLD
        System.out.println(testo.toLowerCase());    // hello world
        System.out.println();

        // Encontrando um caractere em uma String
        // indexOf() método retorna o índice (inclui espaços)

        String txt2 = "Ai meu deus foi um show";
        System.out.println(txt2.indexOf("A"));  // 0
        System.out.println(txt2.indexOf("x"));  // -1
        System.out.println();

        // Caso não encontre retornará -1

        // Podemos concatenar Strings
        String firstName = "Renan";
        String lastName = "Saravalli";

        System.out.println(firstName + " " + lastName); // Renan Saravalli
        System.out.println("ou");
        System.out.println(firstName.concat(lastName)); // RenanSaravalli
    }
}
