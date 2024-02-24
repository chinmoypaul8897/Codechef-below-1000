package codechef500to1000Java;

import java.util.Scanner;

public class bestOfNsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int X = sc.nextInt();
           int Y = sc.nextInt();
           if (X >= Y ) System.out.println(X+Y+(X-Y-1));
           else System.out.println(X+Y+(Y-X-1));
        }
    }
}
