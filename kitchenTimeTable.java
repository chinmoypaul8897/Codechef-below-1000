package codechef500to800Java;

import java.util.Scanner;

public class kitchenTimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // no of students
            int [] arr = new int[N];
            for (int j = 0; j < N ; j++) {
                arr[j] = sc.nextInt();    // time by when the corresponding student should finish cooking.
            }
            int [] brr = new int[N];
            for (int j = 0; j < N; j++) {
                brr[j] = sc.nextInt();   // time required for each of the students to cook
            }
            int count = 0;
            if (arr[0] >= brr[0]) count ++;
            for (int k = 1; k < N; k++) {
                if (arr[k]-arr[k-1] >= brr[k]) count++;
            }
            System.out.println(count);
        }
    }
}
