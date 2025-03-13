package introduction.loops;

public class ForLoop {
    public static void main(String[] args) {
        // Quando sabemos exatamente quantas vezes desejamos executar um loop usamos for

        /*
        * for (statement 1; statement 2; statement 3) {
        *   // Code Block to be executed
        * }
        * */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Loops aninhados

        for (int ii = 0; ii <= 2; ii ++) {
            System.out.println("Outer: " + ii);
            for (int j = 0; j < 4; j ++) {
                System.out.println("Inner" + j);
            }
        }
    }
}
