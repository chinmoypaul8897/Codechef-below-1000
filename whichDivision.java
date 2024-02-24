package codechef500to1000Java;

import java.util.Scanner;

public class whichDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int R = sc.nextInt();
            if (R >= 2000) System.out.println(1);
            else if (R < 2000 && R >= 1600) System.out.println(2);
            else System.out.println(3);
        }
    }
}
