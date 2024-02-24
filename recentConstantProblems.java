package codechef500to1000Java;

import java.util.Scanner;

public class recentConstantProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j = 0; j < T; j++) {
            int N = sc.nextInt();
            int start38 = 0;
            int ltime108 = 0;
            for (int i = 0; i < N ; i++) {
                String S  = sc.next();
                if (S.equals("START38")) start38++;
                else ltime108++;
            }

            System.out.println(start38 + " " + ltime108 );
        }


    }
}
