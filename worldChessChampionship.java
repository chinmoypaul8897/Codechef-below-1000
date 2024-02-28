package codechef500to800Java;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class worldChessChampionship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // the total prize pool 100*X
            String S = sc.next();
            char [] C = S.toCharArray();
            int carlsenPoints = 0 ;
            int chefPoints = 0;
            for (int j = 0; j < 14; j++) {
                if (C[j]=='C') carlsenPoints+=2;
                else if (C[j]=='N') chefPoints+=2;
                else if (C[j]=='D'){
                    chefPoints++;
                    carlsenPoints++;

                }
            }

            if (carlsenPoints>chefPoints) System.out.println(60*X);
            else if (carlsenPoints<chefPoints) System.out.println(40*X);
            else System.out.println(55*X);

        }
    }
}
