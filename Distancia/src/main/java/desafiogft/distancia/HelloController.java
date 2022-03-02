package desafiogft.distancia;

import java.util.Scanner;

public class HelloController {
    public static void main(String[] args) {
        int minutos;
        Scanner input = new Scanner(System.in);

        minutos = input.nextInt();
        System.out.printf("%d minutos\n", 2 * minutos);
    }
}