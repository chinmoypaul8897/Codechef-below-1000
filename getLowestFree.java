package codechef500to800Java;

import java.util.Scanner;

public class getLowestFree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A <= B && A <= C ) System.out.println(B+C);
            else if (B <= A && B <= C  ) System.out.println(A+C);
            else if (C <= A && C <= B ) System.out.println(A+B);
        }
    }
}
