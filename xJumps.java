package codechef500to1000Java;

import java.util.Scanner;

public class xJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   //  he wants to reach stair numbered X .
            int Y = sc.nextInt();  //  number of stairs he can climb in one move.
            if (X<Y) System.out.println(X);
            else {
                if (X % Y == 0 ) System.out.println(X/Y);
                else System.out.println((X/Y)+ (X%Y));
            }
        }
    }
}
