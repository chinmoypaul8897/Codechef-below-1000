package codechef500to1000Java;

import java.util.Scanner;

public class itsMyServe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int serve = P + Q + 1  ;
           if ((serve % 4)==1 ||(serve % 4)==2  ) System.out.println("Alice");
           else System.out.println("Bob");


        }
    }
}
