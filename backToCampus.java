package codechef500to800Java;

import java.util.Scanner;

public class backToCampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();    // total capacity
            int K = sc.nextInt();   // single day capacity
            if (N%K==0) System.out.println(N/K);
            else System.out.println((N/K)+1);
        }
    }
}
