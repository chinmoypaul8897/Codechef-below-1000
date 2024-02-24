package codechef500to1000Java;

import java.util.Scanner;

public class isTheScoreConsistent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();    // initial goal team 1
            int B = sc.nextInt();    // initial goal team2
            System.out.println();
            int C = sc.nextInt();    // Final goal team 1
            int D = sc.nextInt();    // final goal team 2
            if (C >= A && D >= B  ) System.out.println("POSSIBLE ");
            else System.out.println("IMPOSSIBLE ");

        }
    }
}
