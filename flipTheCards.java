package codechef500to800Java;

import java.util.Scanner;

public class flipTheCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // the total number of cards
            int X = sc.nextInt();  //  the number of cards which are initially face-up.
            int Y = N - X ;   // face down
            if (X > Y ) System.out.println(Y);
            else System.out.println(X);
        }
    }
}
