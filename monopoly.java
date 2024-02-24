package codechef500to1000Java;

import java.util.Scanner;

public class monopoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            if (P>Q+R+S || Q > P+R+S || R>P+Q+S || S>P+Q+R)
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
