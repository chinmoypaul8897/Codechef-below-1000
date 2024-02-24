package codechef500to800Java;

import java.util.Scanner;

public class jengaNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   //  the number of people at the party
            int X = sc.nextInt();   //  the number of available tiles respectively
            if (X >= N && X % N == 0 ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
