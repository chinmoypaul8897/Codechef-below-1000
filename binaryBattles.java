package codechef500to1000Java;

import java.util.Scanner;

public class binaryBattles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();  //the number of teams
            int A = sc.nextInt();   // the duration of each round
            int B = sc.nextInt();   // the length of the breaks between rounds
            int temp = 1;
            int totalRounds = 0;
            while (N % 2 == 0) {
                N = N / 2;
                totalRounds++;
            }
            System.out.println(totalRounds * A + (totalRounds - 1) * B);
        }
    }
}