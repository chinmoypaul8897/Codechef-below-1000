package codechef500to1000Java;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // the number of problems
            int X = sc.nextInt();  // the maximum score for each problem
            int Y = sc.nextInt();// the score Chef want
            if (Y % X == 0 ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
