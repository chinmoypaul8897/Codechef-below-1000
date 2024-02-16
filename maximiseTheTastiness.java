package codechef500to800Java;

import java.util.Scanner;

public class maximiseTheTastiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int a = sc.nextInt();   //  the tastiness of the four ingredients.
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(Math.max(a,b)+Math.max(c,d));

        }
    }
}
