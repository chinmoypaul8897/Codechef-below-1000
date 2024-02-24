package codechef500to1000Java;

import java.util.Scanner;

public class endLessAppetizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();    // the lower limit on the number of sticks
            int Y = sc.nextInt();   //  the number of sticks on a single plate
            int R = sc.nextInt();  // money received by Chef
            int extraSticks = R / 30 ;
            int totalSticks = X + extraSticks;
            if ( R == 0  &&  X % Y == 0 ) System.out.println(X/Y);
            else if (R == 0 && X % Y !=  0 ) System.out.println((X/Y)+1);

           else if (totalSticks % Y == 0 ) System.out.println(totalSticks/Y);
           else if (totalSticks % Y != 0) System.out.println((totalSticks/Y)+ 1);


        }
    }
}
