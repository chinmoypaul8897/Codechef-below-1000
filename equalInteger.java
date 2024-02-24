package codechef500to1000Java;

import java.util.Scanner;

public class equalInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
             int X = sc.nextInt();
             int Y = sc.nextInt();
             if (X > Y) {
                if ((X-Y) % 2 == 0 )System.out.println((X - Y) / 2);
                else System.out.println(((X-Y+1)/2)+1);
             }
             else System.out.println(Y-X);
        }
    }
}
