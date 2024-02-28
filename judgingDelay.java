package codechef500to800Java;

import java.util.Scanner;

public class judgingDelay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt(); // N = no of submissions
            int count = 0 ;
            for (int j = 0; j < N; j++) {
                int S = sc.nextInt();   // submission
                int J = sc.nextInt();   // judging
                if (J-S > 5) count++;
            }
            System.out.println(count);
        }
    }
}
