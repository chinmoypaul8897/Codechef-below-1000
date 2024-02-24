package codechef500to1000Java;

import java.util.Scanner;

public class minimumNoOfFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // SIZE OF ARRAY
            int [] arr = new int[N];
            int countOf1 = 0 ;
            for (int j = 0; j < N; j++) {
                arr[j]=sc.nextInt();
                if (arr[j]  == 1  ) countOf1++;
            }
            int countOfNeg = N - countOf1 ;
            if (N % 2 != 0 ) System.out.println(-1);
            else if (countOf1==countOfNeg) System.out.println(0);
            else if (countOf1 == N || countOfNeg == N ) System.out.println(N/2);
            else if (countOf1 > countOfNeg) System.out.println((N/2) - countOfNeg);
            else if (countOf1 < countOfNeg) System.out.println((N/2) - countOf1);
        }
    }
}
