package codechef500to1000Java;

import java.util.Scanner;

public class mileageMatters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // distance that chef needs to travel
            int X = sc.nextInt();   // petrol price
            int Y = sc.nextInt();    // diesel price
            int A = sc.nextInt();    // distance covered by one litre petrol
            int B = sc.nextInt();    //  distance covered by one litre diesel

            float petrolCost = ((float) N /A)*X ;
            float  dieselCost = ((float) N/B)*Y ;

            if (petrolCost==dieselCost) System.out.println("ANY");
            else if (petrolCost < dieselCost) System.out.println("PETROL");
            else System.out.println("DIESEL");
        }
    }
}
