package codechef500to800Java;

import java.util.Scanner;

public class insideTheStadium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();    //  no of balls
            int [] A = new int[N];
            int [] B = new int[N];
            int count = 0 ;
            for (int j = 0; j < N; j++) {
               A[j]=sc.nextInt();   // runs scored on i th ball
                if (j==0) B[j]=A[j];
                else B[j]=A[j]+B[j-1];
                float strikeRate = (float) (B[j]*100)/(j+1);

                if (strikeRate==100) count++;
            }

            System.out.println(count);

        }
    }
}
