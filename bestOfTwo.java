package codechef500to1000Java;

import java.util.Scanner;

public class bestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A1 = sc.nextInt();
            int A2 = sc.nextInt();
            int A3 = sc.nextInt();
            int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            int B3 = sc.nextInt();
            int aliceScore = (A1+A2+A3) - Math.min(Math.min(A1,A2),A3);
            int bobScore =   (B1+B2+B3)   - Math.min(Math.min(B1,B2),B3) ;
            if (aliceScore > bobScore ) System.out.println("ALICE");
            else if (bobScore > aliceScore) System.out.println("BOB");
            else System.out.println("TIE");
        }
    }
}
