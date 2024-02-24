package codechef500to800Java;

import java.util.Scanner;

public class summerHeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int xa = sc.nextInt();   // WATER
            int xb = sc.nextInt();    // PULP
            int Xa = sc.nextInt();
            int Xb = sc.nextInt();
            System.out.println((Xa/xa) + (Xb / xb) );

        }
    }
}
