package codechef500to1000Java;

import java.util.Scanner;

public class oddsAndEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a+b) % 2== 0 ) System.out.println("Bob");
            else System.out.println("Alice");
        }
    }
}
