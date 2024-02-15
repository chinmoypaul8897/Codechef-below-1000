package codechef500to800Java;

import java.util.Scanner;

public class theThreeTopics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();  // the three topics Chef has prepared
            int B = sc.nextInt();
            int C = sc.nextInt();
            int X = sc.nextInt();  // the topic that was given to him on contest day.
            if ( X == A || X == B || X == C )
            {
                System.out.println("Yes");
            }
            else System.out.println("No");


    }
}
