package codechef500to800Java;

import java.util.Scanner;

public class tooManyFloors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int X = sc.nextInt();   // chef room no
           int Y = sc.nextInt();   // chefina room no
            int floorNoOfChefina  ;
            int floorNoOfChef ;
            // finding the floor no of chef

            if ( X % 10 == 0 ) floorNoOfChef = X/10 ;
            else floorNoOfChef = (X/10) + 1 ;
            // finding the floor no of chefina

            if ( Y % 10 == 0 ) floorNoOfChefina = Y/10 ;
            else floorNoOfChefina = (Y/10) + 1 ;
            // the number of floors Chef needs to travel to reach Chefina room
            System.out.println(Math.abs(floorNoOfChef-floorNoOfChefina));




        }
    }
}
