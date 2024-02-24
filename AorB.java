package codechef500to800Java;

import java.util.Scanner;

public class AorB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // time need to solve A
            int Y = sc.nextInt();   // time need to solve B
            int timeAtoB = 500 - (X * 2 ) + 1000 - ((X +Y) * 4 );
            int timeBtoA = 1000 -(Y*4) + 500 - ((X+Y)*2);
            System.out.println(Math.max(timeBtoA,timeAtoB));
        }
    }
}
