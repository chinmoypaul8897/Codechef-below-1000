package codechef500to1000Java;

import java.util.Scanner;

public class candyDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt(); // the no of candies
            int M = sc.nextInt(); // the no of friends
            if (N % M == 0 && (N/M) % 2 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
