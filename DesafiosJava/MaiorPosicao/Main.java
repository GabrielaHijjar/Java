package DesafiosJava.MaiorPosicao;//Desafio
  //      Você recebeu o desafio de ler 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

   //     Entrada
  //      O arquivo de entrada contém 100 números inteiros, positivos e distintos.

   //     Saída
  //      Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.


import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//TODO: Complete os espaços em branco com uma possível solução para o desafio

        List<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <= 100; i++){

            int numero = scan.nextInt();

            numeros.add(    numero     );

        }


        Integer max = Collections.max(   numeros       );

        System.out.println(   max      );

        int position = numeros.indexOf( max ) +1 ;

        System.out.println(  position    );

    }

}