package codechef500to1000Java;

import java.util.Scanner;

public class completeTheCredits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            if (N < 35 ) System.out.println("Underload");
            else if (N > 65 ) System.out.println("Overload");
            else System.out.println("Normal");
        }
    }
}
