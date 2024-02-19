package codechef500to800Java;

import java.util.Scanner;

public class smallFactorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int factorial= 1 ;
            for (int j = 1; j <= N  ; j++) {
                factorial= factorial*j;
            }
            System.out.println(factorial);
        }
    }
}
