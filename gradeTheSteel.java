package codechef500to1000Java;

import java.util.Scanner;

public class gradeTheSteel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            float B = sc.nextFloat();
            int C = sc.nextInt();
                 if (A > 50 && B < 0.7 && C > 5600 ) System.out.println("10");
            else if (A > 50 && B < 0.7 && C <= 5600 ) System.out.println("9");
            else if (A <= 50 && B < 0.7 && C > 5600 ) System.out.println("8");
            else if (A > 50 && B >= 0.7 && C > 5600 ) System.out.println("7");
            else if (A > 50 || B < 0.7 || C > 5600 ) System.out.println("6");
            else System.out.println("5");
        }
    }
}
