import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            double graos = 2;

            for(int j = 1; j < x; j++){
                graos = graos * 2;
            }

            double res = ((graos / 12) / 1000);
            System.out.println((long) res + " kg");   //Complete o código aqui.
        }
        sc.close();
    }
}