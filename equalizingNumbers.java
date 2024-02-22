package codechef500to800Java;

import java.util.Scanner;

public class equalizingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            // A + d =  B -d => 2d = B - A  => d =( B -A) / 2
            // A - d = B + d => 2d = A - B  => d = (A - B ) / 2
            // because d is a integer than A - B should be divided by 2
            int AB = Math.abs(A-B);
            if (AB % 2 == 0 ) System.out.println("YES");
            else System.out.println("NO");


        }
    }
}
