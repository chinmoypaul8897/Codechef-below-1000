package codechef500to800Java;

import java.util.Scanner;

public class chefAndOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int A = sc.nextInt();
           int B = sc.nextInt();
           if ( A < B ) System.out.println("<");
           else if ( A > B ) System.out.println(">");
           else if (A==B ) System.out.println("=");
        }
    }
}
