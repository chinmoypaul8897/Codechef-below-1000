package codechef500to1000Java;

import java.util.Scanner;

public class chefOnIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int x = sc.nextInt();   // food
            int y = sc.nextInt();   // water
            int xr = sc.nextInt();  // food required per day
            int yr = sc.nextInt();  // water required per day
            int D = sc.nextInt();   // time need to reach shore
            int minDays = Math.min((x/xr),(y/yr));
            if (minDays>=D) System.out.println("yes");
            else System.out.println("No");

        }
    }
}
