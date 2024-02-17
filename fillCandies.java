package codechef500to800Java;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class fillCandies {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // total candies
            int K = sc.nextInt();  // no of pockets in a bag
            int M = sc.nextInt();  // each pocket can hold M candies
            int totalNoOfPockets ;
            if (N % M == 0) totalNoOfPockets=N/M;
            else totalNoOfPockets=(N/M)+1;
            if (totalNoOfPockets % K == 0) System.out.println(totalNoOfPockets/K);
            else System.out.println((totalNoOfPockets/K)+1);
        }
    }
}
