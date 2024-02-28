package codechef500to800Java;

import java.util.Scanner;

public class marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int D = sc.nextInt();   // total time in days
           int d = sc.nextInt();   //max chef can run in a day
           int A = sc.nextInt();   // A<B<C
           int B = sc.nextInt();
           int C = sc.nextInt();
           int chefCanCover = D * d ;
           if (chefCanCover>=10 && chefCanCover<21) System.out.println(A);
           else if (chefCanCover>=21 && chefCanCover<42) System.out.println(B);
           else if (chefCanCover>=42 ) System.out.println(C);
           else System.out.println(0);

        }
    }
}
