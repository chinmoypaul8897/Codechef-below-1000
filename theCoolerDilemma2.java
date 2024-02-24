package codechef500to1000Java;

import java.util.Scanner;

public class theCoolerDilemma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // rent per month
            int Y = sc.nextInt();  // purchase price
            if (X >= Y ) System.out.println(0);
            else {
               if (Y % X == 0 )System.out.println((Y / X)-1);
               else System.out.println(Y/X);
            }
        }
    }
}
