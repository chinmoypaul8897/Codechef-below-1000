package codechef500to1000Java;

import java.util.Scanner;

public class findingShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i  = 0; i  < T; i ++) {
            int N = sc.nextInt(); // no of friends
            int M = sc.nextInt();  // no of left shoes he has
            if (M > N ) System.out.println(N);
            else System.out.println(M+((N-M)*2));
        }
    }
}
