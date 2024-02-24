package codechef500to1000Java;

import java.util.Scanner;

public class tooManyItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int N = sc.nextInt();
           if (N % 10 == 0 ) System.out.println(N/10);
           else System.out.println((N/10)+1);
        }
    }
}
