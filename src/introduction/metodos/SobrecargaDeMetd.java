package introduction.metodos;

public class SobrecargaDeMetd {
    public static void main(String[] args) {
        int myNum1 = plusMethod(10, 10);
        double myNum2 = plusMethod(10.20, 19.934);
    }
    // Com a sobrecarga de métds, vários métds podem ter o mesmo nome com parâmetros diferentes
    // Considere o exemplo a seguir, que tem dois métodos que somam nums de tipos diferentes

    static int plusMethodInt(int x, int y) {
        return x + y;
    }
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    // Ao invés de definir dois métodos que fazem a mesma coisa, é melhor sobrecarregar um
    // No exemplo abaixo, sobrecarregamos o plusMethod métod para funcionar com int e double

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    // Obs: Vários métodos podem ter o mesmo nome, desde que o
    // número e/ou tipo de parâmetros sejam diferentes.
}
