package codechef500to800Java;

import java.util.Scanner;

public class carRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int P = sc.nextInt();   // the number of people
           int M = sc.nextInt();   // base fuel economy(km)
           int V = sc.nextInt();   //  amount of fuel present in the car
            System.out.println((M-(P-1))*V);
        }

    }
}
