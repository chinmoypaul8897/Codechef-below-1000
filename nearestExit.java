package codechef500to1000Java;

import java.util.Scanner;

public class nearestExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();
            if (X <= 50 ) System.out.println("LEFT");
            else System.out.println("RIGHT");
        }
    }
}
