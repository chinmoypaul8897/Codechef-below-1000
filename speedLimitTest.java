package codechef500to800Java;

import java.util.Scanner;

public class speedLimitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();  //  distance from home
            int X = sc.nextInt();  // time need to reach
            int B = sc.nextInt(); //  distance from home
            int Y = sc.nextInt();  // time need to reach
            float speedOfAlice = (float) A/X;
            float speedOfBob = (float) B/Y;
            if (speedOfBob > speedOfAlice) System.out.println("BOB");
            else if (speedOfBob < speedOfAlice) System.out.println("ALICE");
            else System.out.println("Equal");


        }
    }
}
