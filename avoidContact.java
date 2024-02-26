package codechef500to800Java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class avoidContact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // total people
            int Y = sc.nextInt();   // infected people
            if ( Y == 0 ) System.out.println(X);
            else if (X==Y) System.out.println((Y*2)-1);
            else System.out.println(((Y*2)) + (X-Y));
        }
    }
}
