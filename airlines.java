package codechef500to800Java;

import java.util.Scanner;

public class airlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   //  the number of aircraft the airline owns
            int N = sc.nextInt();   // the number of passengers travelling
            if (N <= X * 100 ) System.out.println(0);
            else {
                int extraPassengers = N - (X*100)  ;
                if (extraPassengers % 100 == 0) System.out.println(extraPassengers/100);
                else System.out.println((extraPassengers/100)+1);
            }

        }
    }
}
