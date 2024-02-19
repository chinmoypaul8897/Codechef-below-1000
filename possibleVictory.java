package codechef500to800Java;

import java.util.Scanner;

public class possibleVictory {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            int R = sc.nextInt();   // team A total score
            int O = sc.nextInt();  // C  runs in the first O overs
            int C = sc.nextInt();   //  total runs of B in O overs
            int runNeeded = R - C ;   // IN 20 - O overs
            int totalRun = (20-O)*6*6  ;
            if (totalRun > runNeeded) System.out.println("YES");
            else System.out.println("NO");

    }
}
