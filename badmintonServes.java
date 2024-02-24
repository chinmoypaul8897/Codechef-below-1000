package codechef500to800Java;

import java.util.Scanner;

public class badmintonServes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int P = sc.nextInt();  // the points obtained by Chef
             System.out.println((P/2)+1);

        }
    }
}
