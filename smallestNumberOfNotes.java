package codechef500to1000Java;

import java.util.Scanner;

public class smallestNumberOfNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int A = 100;
            int count = 0 ;
            while (N >= 1  )
            {
               if (N >= A ) {
                   count = count + (N / A);
                   N = N % A;
                   if (A==50) A = A/5  ;
                   else A = A / 2 ;
               }
               else {
                   if (A==50) A = A/5  ;
                   else A = A / 2 ;
               }


            }
            System.out.println(count);
        }
    }
}
