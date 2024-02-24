package codechef500to1000Java;

import java.util.Scanner;

public class primalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int count = 0;
            if (N == 1) System.out.println("no");
            else {
                for (int j = 2; j < N; j++) {
                    if (N % j == 0) count++;
                }
                if (count == 0) System.out.println("yes");
                else System.out.println("no");
            }
        }
    }

}
