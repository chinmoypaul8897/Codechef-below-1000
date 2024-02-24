package codechef500to1000Java;

import java.util.Scanner;

public class greaterAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            float AV = (float)(A+B)/2;
            if (AV> C ) System.out.println("YES");
            else System.out.println("NO");


        }
    }
}
