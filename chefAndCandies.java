package codechef500to1000Java;

import java.util.Scanner;

public class chefAndCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T  ; i++) {
            int  N = sc.nextInt();  //  the number of children
            int X = sc.nextInt();   // the number of candies Chef already has
            int a = N - X ;
            while ( a >= 1 )
            {
                if ( a % 4 == 0 ) System.out.println(a/4);
                else System.out.println((a/4) + 1 );
                break;
            }
           if (a<=0) System.out.println(0);  // a is negative means X>=N



        }
    }
}
