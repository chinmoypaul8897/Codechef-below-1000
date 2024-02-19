package codechef500to800Java;

import java.util.Scanner;

public class reachFast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  //  the initial coordinate of Chef
            int Y = sc.nextInt();   // the initial coordinate of Chefina
            int K = sc.nextInt();    //  the maximum number of coordinates Chef can move in one step.
            int distance = Math.abs(X-Y);
            if (distance % K == 0 ) System.out.println(distance/K );
            else System.out.println((distance/K) + 1 );


        }
    }
}
