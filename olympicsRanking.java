package codechef500to800Java;

import java.util.Scanner;

public class olympicsRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int G1 = sc.nextInt();
           int S1 = sc.nextInt();
           int B1 = sc.nextInt();
           int G2 = sc.nextInt();
           int S2 = sc.nextInt();
           int B2 = sc.nextInt();
           if (G1+S1+B1>G2+S2+B2) System.out.println(1);
           else System.out.println(2);
        }
    }
}
