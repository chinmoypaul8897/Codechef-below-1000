package codechef500to800Java;

import java.util.Scanner;

public class gameBetweenFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();  //  Nitin
            int B = sc.nextInt();  // Sobhagya
            int C = sc.nextInt();
            int D = sc.nextInt();
            if (A>B) B=B+C;
            else A=A+C;
            if (B>A) A=A+D;
            else B=B+D;
            if (B>A) System.out.println("S");
            else System.out.println("N");
        }
    }
}
