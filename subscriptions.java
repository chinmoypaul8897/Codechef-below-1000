package codechef500to800Java;

import java.util.Scanner;

public class subscriptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N  = sc.nextInt();  //  the size of the group of friends
            int X = sc.nextInt();   //  the cost of one subscription
            if (N % 6 == 0 ) System.out.println((N/6)*X);
            else if (N<6) System.out.println(X);
            else System.out.println(((N/6)+1)*X);

        }
    }
}
