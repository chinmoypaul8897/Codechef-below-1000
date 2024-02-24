package codechef500to1000Java;

import java.util.Scanner;

public class wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            String S = sc.next();
            String T = sc.next();
            StringBuilder M = new StringBuilder();
            for (int j = 0; j < 5 ; j++) {
                if (S.charAt(j)==T.charAt(j))  M.append("G");
                else M.append("B");

            }
            System.out.println(M);

        }
    }
}
