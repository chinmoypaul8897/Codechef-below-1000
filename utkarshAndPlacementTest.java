package codechef500to800Java;

import java.util.Scanner;

public class utkarshAndPlacementTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            char A = sc.next().charAt(0);  // first Preference
            char B = sc.next().charAt(0);  // second
            char C = sc.next().charAt(0);   // third
            char x = sc.next().charAt(0);
            char y = sc.next().charAt(0);

           if (x==B && y==C || y == B && x == C ) System.out.println(B);
           else System.out.println(A);

        }
    }
}
