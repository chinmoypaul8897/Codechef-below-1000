package codechef500to800Java;

import java.util.Scanner;

public class credCoins {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); // cred coins get per bill
            int Y =sc.nextInt();  // no of bills paid
            System.out.println((X*Y)/100);
        }
    }
}
