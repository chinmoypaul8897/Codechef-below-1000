package codechef500to800Java;

import java.util.Scanner;

public class idAndShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            char a = sc.next().charAt(0);
            if (a== 'B' || a == 'b') System.out.println("BattleShip");
            else if (a== 'C' || a == 'c') System.out.println("Cruiser");
            else if (a== 'D' || a == 'd') System.out.println("Destroyer");
            else if (a== 'F' || a == 'f') System.out.println("Frigate");
        }
    }
}
