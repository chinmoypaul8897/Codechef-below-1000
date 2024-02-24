package codechef500to1000Java;

import java.util.Scanner;

public class farmersLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // total teams
            System.out.println((N/2)*3);

        }
    }
}
