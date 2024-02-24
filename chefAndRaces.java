package codechef500to1000Java;

import java.util.Scanner;

public class chefAndRaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // chef
            int Y = sc.nextInt();  // chef
            int A = sc.nextInt();  // rival
            int B = sc.nextInt();  // rival
            if (A != X && A != Y && B != X && B != Y ) System.out.println(2);
            else if (A != X && A != Y || B != X && B != Y )
            System.out.println(1);
            else System.out.println(0);
        }


    }
}
