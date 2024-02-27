package codechef500to800Java;

import java.util.Scanner;

public class chefAndPriceControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int totalRevenue = 0 ;
            int revenueAfterCeil = 0 ;
            int [] arr = new int[N];
            for (int j = 0; j < N ; j++) {
                arr[j] = sc.nextInt();
                totalRevenue+=arr[j];
                if (arr[j] >  K ) arr[j]=K;
            }
            for (int j = 0; j < N; j++) {
                revenueAfterCeil+=arr[j];
            }
            System.out.println(totalRevenue-revenueAfterCeil);
        }
    }
}
