package codechef500to1000Java;

import java.util.Scanner;

public class expertSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   //  the number of problems submitted
            int Y = sc.nextInt();   // the number of problems that were approved
            if ( X % 2 == 0 && Y >= X/2) System.out.println("YES");
            else if (X % 2 != 0 && Y >= (X/2)+1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
