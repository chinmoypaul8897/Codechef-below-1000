package codechef500to1000Java;

import java.util.Scanner;

public class theBlockGame {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int M = N ;
            int reverse = 0 ;
            int lastdigit = 0 ;
            while(N > 0 )
            {
                 lastdigit  = N%10;
                 N = N/10;
                 reverse = reverse*10 + lastdigit;
            }
            if (M ==reverse) System.out.println("wins");
            else System.out.println("loses");
        }

    }
}
