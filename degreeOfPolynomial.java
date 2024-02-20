package codechef500to800Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class degreeOfPolynomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int [] arr = new int[N];
            int count = 0 ;
            for (int j = 0; j < N ; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] != 0 ) count++;
            }
            int [] ans = new int[count];
            for (int j = 0; j < N; j++) {
                if (arr[j]  != 0 ) {
                    for (int k = 0; k < count; k++) {
                        ans[k]=j;
                    }
                }
            }
            int high = 0 ;
            for (int k = 0; k < count; k++) {
                if (ans[k] > high) high =ans[k];
            }
            System.out.println(high);


        }
    }
}
