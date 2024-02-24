package codechef500to800Java;

import java.util.Scanner;

public class carOrBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // bike
            int Y = sc.nextInt();   // car
            if (X > Y ) System.out.println("CAR");
            else if (X<Y) System.out.println("BIKE ");
            else System.out.println("SAME ");
        }
    }
}
