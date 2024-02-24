package codechef500to1000Java;

import java.util.Scanner;

public class buildingRace {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();  // the current floor of Chef
            int B = sc.nextInt();  // the current floor of Chefina
            int X = sc.nextInt();  // speed of Chef
            int Y = sc.nextInt();   // speed of Chefina
            float timeOfChef = (float) A/X;
            float timeOfChefina = (float) B/Y ;
            if ( timeOfChef < timeOfChefina ) System.out.println("CHEF");
            else if (timeOfChef > timeOfChefina ) System.out.println("CHEFINA");
            else  System.out.println("BOTH");

        }
    }
}
