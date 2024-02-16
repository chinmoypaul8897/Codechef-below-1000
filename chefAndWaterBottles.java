package codechef500to800Java;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class chefAndWaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  //   no of bottles
            int X = sc.nextInt();     // capacity of bottle
            int K = sc.nextInt();  // water at tank
            if (K>(N*X)) System.out.println(N);
            else if (K<X) System.out.println(0);
            else if (K<(N*X)) System.out.println(K/X);

        }
    }
}
