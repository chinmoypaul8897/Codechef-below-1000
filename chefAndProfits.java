package codechef500to800Java;

import java.util.Scanner;

public class chefAndProfits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
           int X = sc.nextInt();   //  the number of stocks
           int Y = sc.nextInt();   //  the price they were bought at
           int Z = sc.nextInt();   //  the price they can be sold at
            System.out.println((X*Z)-(Y*X));
        }
    }
}
