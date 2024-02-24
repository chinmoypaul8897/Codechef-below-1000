package codechef500to1000Java;

import java.util.Scanner;

public class marioAndTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); // no of mushrooms
            if ( X % 3 == 0 ) System.out.println("NORMAL");
            else {
                if (X % 3 == 1 ) System.out.println("HUGE");
                else System.out.println("SMALL");
            }
        }
    }
}
