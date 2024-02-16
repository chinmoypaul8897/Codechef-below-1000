package codechef500to800Java;

import java.util.Scanner;

public class busSitNumbering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            if (N <= 15 )    // LOWER DECK
            {
                if (N <= 10 ) System.out.println("Lower Double");
                else System.out.println("Lower Single");
            }
            else {           // UPPER DECK
                if (N<=25) System.out.println("Upper Double");
                else System.out.println("Upper Single");
            }
        }
    }
}
