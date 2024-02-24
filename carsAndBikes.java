package codechef500to1000Java;

import java.util.Scanner;

public class carsAndBikes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // numbers of tyres
            if (N % 4 >= 2 ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
