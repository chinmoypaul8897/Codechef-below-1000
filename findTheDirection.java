package codechef500to800Java;

import java.util.Scanner;

public class findTheDirection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();
            if (X % 4 == 1 ) System.out.println("EAST");
            else if (X % 4 == 2) System.out.println("SOUTH");
            else if (X % 4 == 3 ) System.out.println("WEST");
            else if (X % 4 == 0 ) System.out.println("NORTH");
        }
    }
}
