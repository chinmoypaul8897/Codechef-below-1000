package codechef500to1000Java;

import java.util.Scanner;

public class policeAndTheif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int X = sc.nextInt();   //   initial location of the policeman
           int Y = sc.nextInt();   //  initial location of the thief
            if (X > Y ) System.out.println(X-Y);
            else System.out.println(Y-X);
        }
    }
}
