package introduction.loops;

public class ForEachLoop {
    public static void main(String[] args) {
        // For que é utilizado exclusivamente para percorrer elementos em uma matriz

        /* for (type variableName : arrayName) {
            // code block to be executed
        }* */
        // Example

        String[] cars = {"Volvo", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
        // Saída:
        /*  Volvo
            Ford
            Mazda
        * */
    }
}
