package codechef500to800Java;

import java.util.Scanner;

public class theLeadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // numbers of round
        int [] S = new int[N];   // player 1 numbers
        int [] T = new int[N];   // player 2 numbers
        int [] L = new int[N];   // lead numbers
        int totalScore1 = 0 ;
        int totalScore2 = 0 ;
        int winnerindx = 0 ;
        int highestLead = Integer.MIN_VALUE ;
        for (int i = 0; i < N; i++) {
            S[i]= sc.nextInt();    // scores of player 1
            T[i] = sc.nextInt();   // scores of player 2
            // finding the cummalative score of the players
            totalScore1+=S[i];
            totalScore2 +=T[i];
            // finding the leads
            L[i] = Math.abs(totalScore1-totalScore2);   // lead
            if (L[i] > highestLead ) {
                highestLead = L[i];
                winnerindx = i ;
            }

            }
           if (S[winnerindx] > T[winnerindx] ) System.out.println("1 " + highestLead);
           else if (S [winnerindx] < T[winnerindx]) System.out.println("2 " + highestLead);
        }
}
