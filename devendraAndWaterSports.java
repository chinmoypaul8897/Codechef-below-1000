package codechef500to1000Java;

import java.util.Scanner;

public class devendraAndWaterSports {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int Z = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (Z-Y >= A+B+C ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
