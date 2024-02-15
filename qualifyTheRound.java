package codechef500to800Java;

import java.util.Scanner;

public class qualifyTheRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // required points
            int A = sc.nextInt();   // easy 1 point
            int B = sc.nextInt();   // hard  2 point
            if (A +(B*2) >= X ) System.out.println("Qualify");
            else System.out.println("NotQualify ");

        }

    }
}
