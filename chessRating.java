package codechef500to1000Java;

import java.util.Scanner;

public class chessRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); // current rating
            int Y = sc.nextInt(); // final rating
            int A = Y - X ;
            if (A >= 8 )
            {
                if (A%8==0) System.out.println(A/8);
                else System.out.println((A/8)+1);
            }
            else if (A==0) System.out.println(0);
            else System.out.println(1);
        }
    }
}
