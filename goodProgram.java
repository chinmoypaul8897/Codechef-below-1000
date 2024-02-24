package codechef500to1000Java;

import java.util.Scanner;

public class goodProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // the number of bits taken by the program.
           if (N >= 4 && N % 4 == 0 ) System.out.println("GOOD");
           else System.out.println("Not Good ");
        }
    }
}
