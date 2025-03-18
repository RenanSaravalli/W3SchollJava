package exercicios;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Uma distância em metros: ");
        float distancia = read.nextFloat();

        float km = distancia / 1000;
        float hm = distancia / 100;
        float dam = distancia / 10;
        float dm = distancia * 10;
        float cm = distancia * 100;
        float mm = distancia * 1000;
        System.out.printf("A medida de %.1fm corresponde a\n", distancia);
        System.out.println(km + "km");
        System.out.println(hm + "hm");
        System.out.println(dam + "dam");
        System.out.println(dm + "dm");
        System.out.println(cm + "cm");
        System.out.println(mm + "mm");
    }
}
