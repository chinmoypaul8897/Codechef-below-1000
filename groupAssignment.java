package codechef500to800Java;

import java.util.Scanner;

public class groupAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // no of groups
            int X = sc.nextInt();    // chef roll number
            System.out.println((2*N+1)-X);
        }
    }
}
