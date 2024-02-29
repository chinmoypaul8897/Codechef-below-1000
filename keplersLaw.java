package codechef500to800Java;

import java.util.Scanner;

public class keplersLaw {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int T1 = sc.nextInt();
            int T2 = sc.nextInt();
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            float P1 = (float) (T1*T1)/(R1*R1*R1);
            float P2 = (float) (T2*T2)/(R2*R2*R2);
            if (P1==P2) System.out.println("Yes");
            else System.out.println("No");

        }
    }
}
