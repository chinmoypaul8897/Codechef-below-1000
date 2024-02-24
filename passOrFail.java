package codechef500to1000Java;

import java.util.Scanner;

public class passOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // total questions
            int X = sc.nextInt();  // correct answers
            int P = sc.nextInt();   // minimum marks to pass
            int chefMarks = (N-X)*(-1) + X*3;
            if (P > chefMarks) System.out.println("FAIL");
            else System.out.println("PASS");

        }
    }
}
