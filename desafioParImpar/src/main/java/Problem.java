import java.io.IOException;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {

            int X = leitor.nextInt();
            if (X==0)
                System.out.println("NULL\n");

            else if ( X<=0 && X%2== 0 )
                System.out.println("EVEN NEGATIVE\n");

            else if (X<=0 && X%2== -1)
                System.out.println("ODD NEGATIVE\n");

            else if (X>=0 && X%2== 0)
                System.out.println("EVEN POSITIVE\n");

            else

                System.out.println("ODD POSITIVE");

        }
    }

}