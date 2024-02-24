package codechef500to1000Java;

import java.util.Scanner;

public class carChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int x1 = sc.nextInt();    // runs x1 km / lit diesel
            int x2 = sc.nextInt();    // runs x2 km / lit petrol
            int y1 = sc.nextInt();   // diesel price
            int y2 = sc.nextInt();   // petrol price
            float costOfCar1 =(float) y1/x1;
            float costOfCar2 =(float) y2/x2;
            System.out.println(costOfCar1);
            System.out.println(costOfCar2);
            if (costOfCar2 < costOfCar1) System.out.println(1);
            else if (costOfCar2 > costOfCar1) System.out.println(-1);
            else System.out.println(0);



        }
    }
}
