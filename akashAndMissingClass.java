package codechef500to800Java;

import java.util.Scanner;

public class akashAndMissingClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            if (N % 7 > 5 ) System.out.println((N/7)+1);
            else System.out.println(N/7);
        }
    }
}
