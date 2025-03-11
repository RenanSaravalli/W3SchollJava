package introduction.conditions;

public class SwitchCase {
    public static void main(String[] args) {
        /*  switch(expression) {
            case x:
                // code block
            break;
            case y:
                // code block
            break;
            default:
                // code block
        }   COMO FUNCIONA:
        - A switch expressão é avaliada uma vez
        - O valor da expressão é comparado com os valores de cada case
        - Se houver uma correspondência, o bloco de código associado será executado
        - As palavras-chave break e default são opacionais
        * */
        // O ex: abaixo usa o num do dia da semana p/ calcular o nome do dia da semana
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        } // Thursday

        // A PALAVRA-CHAVE BREAK
        /*  Quando o java atinge uma pal-chave break, ele sai do bloco do switch
            Isso interromperá a execução de mais código e testes de caso dentro do bloco
            Quando uma correspondência é encontrada, e o trabalho é feito, é hora de uma pausa
            Não há necessidade de mais testes
        * */

        // default -> especifica algum código a ser executado se não houver correspondência

    }
}
