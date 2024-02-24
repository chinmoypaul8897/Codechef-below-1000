package codechef500to800Java;

import java.util.Scanner;

public class reverseTheNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
        for (int i = 0; i < T  ; i++) {
            int N = sc.nextInt();
            while (N % 10 == 0 ) N = N/10;
            while ( N > 0 ) {
                int lastDigit = N % 10;
                N = N / 10;
                System.out.print(lastDigit);
            }
            System.out.println();
        }

    }
}
