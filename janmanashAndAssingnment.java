package codechef500to800Java;

import java.util.Scanner;

public class janmanashAndAssingnment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i  = 0; i  < T; i ++) {
          int X = sc.nextInt(); //  the time when Janmansh starts doing the assignemnts
            if ( 10 - X >= 3 ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
