package codechef500to800Java;

import java.util.Scanner;

public class thePreparations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int M = sc.nextInt();  // exam time left
            int N = sc.nextInt();   // no of episodes
            int K = sc.nextInt();   // duration of each episode
            if (M > N * K ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
