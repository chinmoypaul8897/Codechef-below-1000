package codechef500to1000Java;

import java.util.Scanner;

public class chefEren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // the number of episodes
            int A = sc.nextInt();   // the durations of each even-indexed
            int B = sc.nextInt();   // odd-indexed episodes duration
            int countOddNum = 0 ;
            for (int j = 1; j <= N; j+=2) {
                countOddNum++;
            }
            int countEvenNum = N - countOddNum;
            System.out.println((countEvenNum*A)+(countOddNum*B));
        }
    }
}
