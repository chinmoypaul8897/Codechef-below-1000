package codechef500to800Java;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class cricketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int R1 =sc.nextInt();   // PLAYER A
            int W1 =sc.nextInt();
            int C1 =sc.nextInt();
            int R2 =sc.nextInt();   // PLAYER B
            int W2 =sc.nextInt();
            int C2 =sc.nextInt();
            int scoreOfA = 0 ;
            int scoreOfB = 0 ;
            if (R1>R2) scoreOfA ++ ;
            else scoreOfB++;
            if (W1>W2) scoreOfA ++ ;
            else scoreOfB++;
            if (C1>C2) scoreOfA ++ ;
            else scoreOfB++;
            if (scoreOfA>scoreOfB) System.out.println("A");
            else System.out.println("B");


        }
    }
}
