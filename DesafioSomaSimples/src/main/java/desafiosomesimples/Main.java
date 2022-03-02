
//Desafio

//Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.
//A seguir escreva o valor desta variável.
//Entrada
//O arquivo de entrada contém 2 valores inteiros.
//Saída
//Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.


package desafiosomesimples;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int SOMA = A+B;

        System.out.println("SOMA = "+SOMA);
    }
}
