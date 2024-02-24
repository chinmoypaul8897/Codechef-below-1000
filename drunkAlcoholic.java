package codechef500to800Java;

import java.util.Scanner;

public class drunkAlcoholic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int k = sc.nextInt();
            if (k%2==0) System.out.println(k);
            else System.out.println(k+2);
        }
    }
}
