package codechef500to1000Java;

import java.util.Scanner;

public class chefAndContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X =sc.nextInt();  // chef time
            int Y = sc.nextInt();  // chefina time
            int P = sc.nextInt();   // wrong by chef
            int Q = sc.nextInt();   // wrong by chefina
            if (X + (P* 10) < Y + (Q*10)) System.out.println("Chef");
            else if (X + (P* 10)  > Y + (Q*10)) System.out.println("Chefina");
            else System.out.println("Draw");

        }
    }
}
