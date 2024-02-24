package codechef500to1000Java;

import java.util.Scanner;

public class sastaSharkTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();   //  amount offered by first investor for 10 %
            int B = sc.nextInt();   //  amount offered by second investor for 20%
            int AV = A * 10  ;
            int BV = B * 5 ;
            if (AV>BV) System.out.println("FIRST");
            else if (BV>AV) System.out.println("SECOND");
            else System.out.println("ANY");
        }
    }
}
