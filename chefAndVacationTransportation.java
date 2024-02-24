package codechef500to800Java;

import java.util.Scanner;

public class chefAndVacationTransportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int X = sc.nextInt();
           int Y = sc.nextInt();
           int Z = sc.nextInt();
           if (X + Y < Z ) System.out.println("PLANEBUS");
           else  if (X + Y > Z ) System.out.println("TRAIN");
           else System.out.println("EQUAL");
        }
    }
}
