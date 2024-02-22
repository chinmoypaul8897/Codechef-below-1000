package codechef500to800Java;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class circularTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();  // initial checkpoint
            int B = sc.nextInt();  // final checkpoint
            int M = sc.nextInt();  // total no of check points
            // he can move forward or backward
            if (A < B ) System.out.println(Math.min(Math.abs(B-A),Math.abs(M-B+A)));
            else System.out.println(Math.min(Math.abs(B-A),Math.abs(M-A+B)));

        }
    }
}
