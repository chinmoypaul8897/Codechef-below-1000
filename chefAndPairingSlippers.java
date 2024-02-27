package codechef500to800Java;

import java.util.Scanner;

public class chefAndPairingSlippers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // the total number of slippers
            int L = sc.nextInt();   // the number of left slippers
            int X = sc.nextInt();   //  the price of a pair of slippers in rupees
            if (N - L  > L ) System.out.println(L*X);
            else System.out.println((N-L)*X);

        }
    }
}
