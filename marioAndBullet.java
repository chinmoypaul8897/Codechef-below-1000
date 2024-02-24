package codechef500to1000Java;

import java.util.Scanner;

public class marioAndBullet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int X = sc.nextInt();   // speed of bullet
           int Y = sc.nextInt();   // distance of the goomba
           int Z = sc.nextInt();    //  hits the goomba after at least Z seconds
            int A = Y/X;
            if (Z>=A) System.out.println(Z-A);
            else System.out.println("0");
        }
    }
}
