package codechef500to800Java;

import java.util.Scanner;

public class LiLiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int R = 0 , B = 0 , M = 0 , E = 0 ;
            for (int j = 0; j < 4 ; j++) {
                String S = sc.next();
                int goals = sc.nextInt();
                if (S.equals("RealMadrid")) R=goals;
                else if (S.equals("Barcelona")) B = goals;
                else if (S.equals("Eibar")) E = goals;
                else if (S.equals("Malaga")) M = goals;
            }
            if (R < M && B > E  ) System.out.println("Barcelona");
            else System.out.println("RealMadrid");
        }
    }
}
