package codechef500to800Java;

import java.util.Scanner;

public class chessBoardDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X1 = sc.nextInt();  // first point
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();  // second point
            int Y2 = sc.nextInt();
            int X = X1-X2 ;
            int Y = Y1-Y2;
            if (X < 0 ) X *=(-1);
            if ( Y < 0 ) Y *= (-1);
            System.out.println(Math.max(X,Y));
        }
    }
}
