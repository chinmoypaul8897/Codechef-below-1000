package codechef500to800Java;

import java.util.Scanner;

public class hardestProblemBet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
          int Sa = sc.nextInt();   // number of successful submissions of problems
          int Sb = sc.nextInt();
          int Sc = sc.nextInt();
          int min = Math.min(Math.min(Sa,Sb),Sc);
          if (Sa==min) System.out.println("Draw");
          else if (Sb==min) System.out.println("Bob");
          else System.out.println("Alice");
        }
    }
}
