package codechef500to1000Java;

import java.util.Scanner;

public class highestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 10 ; i > 0; i--) {
            if (N % i == 0 ) {
                System.out.println(i);
                break;
            }
        }
    }
}
