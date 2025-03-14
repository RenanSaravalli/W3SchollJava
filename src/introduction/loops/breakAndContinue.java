package introduction.loops;

public class breakAndContinue {
    public static void main(String[] args) {
        // Já vimos o break sendo utilizado no switch para ("saltar para fora")
        // A declaração break tb pode ser usada para sair de um loop
        // Neste exemplo interrompe o loop quando i é igual a 4;
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            // 0, 1, 2, 3
            System.out.println(i);
        }
        System.out.println();

        // Agora vamos ver sobre o Continue
        // Ela interrompe uma interação (no loop), se uma condição especificada ocorrer
        // e continua com a próxima interação no loop
        // este exemplo ignora o valor 4 e continua a iteração ao invés de parar

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        // 0, 1, 2, 3, 5, 6, 7, 8, 9
        System.out.println();

        // Podemos utizar o break e continue no while
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
            // 0, 1, 2, 3
        }
        System.out.println();

        i = 0;
        while(i < 10) {
           if (i == 4) {
               i++;
               continue;
           }
            System.out.println(i);
            i++;
        } // 0, 1, 2, 3, 5, 6, 7, 8, 9
    }
}
