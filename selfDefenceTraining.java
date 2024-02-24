package codechef500to800Java;

import java.util.Scanner;

public class selfDefenceTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
          int N = sc.nextInt();
          int [] arr = new int[N];
            int count = 0 ;

            for (int j = 0; j < N ; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] >= 10 && arr[j] <= 60 ) count++;
            }

            System.out.println(count);

        }

    }
}
