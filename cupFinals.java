package codechef500to800Java;

import java.util.Scanner;

public class cupFinals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   //  first team skill level
            int Y = sc.nextInt();  // second team  skill level
            int D = sc.nextInt();   // maximum skill difference
            if (X >= Y )
            {
                if ((X-Y) <= D ) System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                if ((Y- X ) <= D ) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
