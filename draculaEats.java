package codechef500to1000Java;

import java.util.Scanner;

public class draculaEats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            if (N % 7 >= 2) System.out.println((N/7)+1);
            else if ( N >= 2 && N <= 7 ) System.out.println(1);
            else System.out.println(N/7);

        }
    }
}
