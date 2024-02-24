package codechef500to1000Java;

import java.util.Scanner;

public class whichMixture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A > 0 && B > 0 ) System.out.println("Solution");
            else if (B==0) System.out.println("Solid");
            else if (A==0) System.out.println("Liquid");
        }
    }
}
