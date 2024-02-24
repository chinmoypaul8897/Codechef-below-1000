package codechef500to800Java;

import java.util.Scanner;

public class blackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();  // first number
            int B = sc.nextInt();   // second number
            if (A+B >= 11) System.out.println(21-(A+B));
            else System.out.println(-1);
        }
    }
}
