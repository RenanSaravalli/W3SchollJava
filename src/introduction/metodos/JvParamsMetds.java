package introduction.metodos;

public class JvParamsMetds {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " Saravalli");
        System.out.println("idade: " + age);
    }
    public static void main(String[] args) {
        myMethod("Renan", 19);
    }
}
