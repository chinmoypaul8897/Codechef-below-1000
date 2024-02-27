package codechef500to800Java;

import java.util.Scanner;

public class firstAndLast {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();    // lenth of array A
            int [] A = new int[N];
            int [] sum = new int[N];
            for (int j = 0; j < N ; j++) {
                A[j]=sc.nextInt();
            }
            int max = A[0]+A[N-1] ;
            for (int j = 0; j < N-1 ; j++) {
                sum[j]=A[j]+A[j+1];
            }
            for (int j = 0; j < N ; j++) {
                max = Math.max(sum[j],max);
            }
            System.out.println(max);
        }
    }
}
