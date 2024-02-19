package codechef500to800Java;

import java.util.Scanner;

public class mutatedMinors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int [] arr = new int[N];
            int count = 0 ;
            for (int j = 0; j < N ; j++) {
                arr[j] = sc.nextInt();
                arr[j]+=K;
                if (arr[j] % 7 == 0 ) count ++ ;
            }
            System.out.println(count);

        }
    }
}
