package codechef500to800Java;

import java.util.Scanner;

public class valentineIsComing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();    // total money
            int Y = sc.nextInt();    // one chocolate cost
            if (X<Y) System.out.println(0);
            else System.out.println(X/Y);
        }
    }
}
