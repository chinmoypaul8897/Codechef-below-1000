package codechef500to800Java;

import java.util.Scanner;

public class relativity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int g = sc.nextInt();
            int c = sc.nextInt();
            System.out.println((c*c)/(2*g));
        }
    }
}
