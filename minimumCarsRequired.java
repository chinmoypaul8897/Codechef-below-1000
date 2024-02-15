package codechef500to800Java;

import java.util.Scanner;

public class minimumCarsRequired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt(); // no of friends
            if ( N % 4 == 0 ) System.out.println(N/4);
            else System.out.println((N/4)+1);
        }
    }
}
