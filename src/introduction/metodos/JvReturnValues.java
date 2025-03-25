package introduction.metodos;

public class JvReturnValues {
    public static void main(String[] args) {
        // Se quiser que o métod retorne um valor, usamos um tipo de dado primitivo (
        // como int, char, etc..)
        System.out.println(myMethod(3));

        // Podemos armazenar o valor de retorno em uma variável

        int z = myMethod(10);
        System.out.println(z);
    }

    static int myMethod(int x) {
        return 5+x;
    }
}
