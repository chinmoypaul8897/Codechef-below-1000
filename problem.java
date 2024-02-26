package codechef500to800Java;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
          int N = sc.nextInt();   // alice
          int M = sc.nextInt();   // bob
            if (Math.abs(N-M) % 2 == 0 ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
