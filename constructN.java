package codechef500to800Java;

import java.util.Scanner;

public class constructN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
             int N = sc.nextInt();
             if (N < 7 )
             {
                 if ( N % 2 == 0 ) System.out.println("YES");
                 else System.out.println("NO");
             }
             else {
                 if ((N % 7)%2 == 0 || (N % 2)%7 == 0  || (N-7)%2==0 || (N-2) % 7 == 0 ) System.out.println("YES");
                 else System.out.println("NO");
             }
        }
    }
}
