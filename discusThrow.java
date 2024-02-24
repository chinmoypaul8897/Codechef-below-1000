package codechef500to800Java;

import java.util.Scanner;

public class discusThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
          int  A = sc.nextInt();   /// distance of each throw
          int  B = sc.nextInt();
          int C = sc.nextInt();
          int D = Math.max(A,B);
            System.out.println(Math.max(D,C));
        }
    }
}
