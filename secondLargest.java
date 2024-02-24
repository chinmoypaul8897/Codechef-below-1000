package codechef500to1000Java;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = Math.max(A,B);
            int max = Math.max(D,C);
            int E = Math.min(A,B);
            int min = Math.min(E,C);
             // FINDING THE SECOND LARGEST
            if ( A > min && A < max ) System.out.println(A);
            else if ( B > min && B < max  ) System.out.println(B);
            else System.out.println(C);
        }

    }
}
