package com.example.tempojogo;


import java.io.IOException;
import java.util.Scanner;

public class TempodeJogo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int horaInicio = leitor.nextInt();
        int horaFinal = leitor.nextInt();

        if (horaInicio > horaFinal) {
            System.out.println("O JOGO DUROU " + (24 - (horaInicio - horaFinal)) + " HORA(S)");


        }
        else if (horaFinal > horaInicio) {
            System.out.println("O JOGO DUROU " + (horaFinal - horaInicio) + " HORA(S)");
        }
        else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

    }

}