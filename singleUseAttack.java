package codechef500to1000Java;

import java.util.Scanner;

public class singleUseAttack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int H = sc.nextInt();   // total health points
            int X = sc.nextInt();   //  each attack reduces points
            int Y = sc.nextInt();   // each attack will reduce points
            int healthPoint = H - Y ;  //  after Y type  attack
            if (healthPoint % X == 0 ) System.out.println((healthPoint/X) + 1);
            else System.out.println((healthPoint/X)+ 1 + 1 );
        }
    }
}
