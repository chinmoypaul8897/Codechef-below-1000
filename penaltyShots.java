package codechef500to800Java;

import java.util.Scanner;

public class penaltyShots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int [] arr = new int[11];
            int goalTeam1 = 0;
            int goalTeam2 = 0 ;
            for (int j = 1; j <= 10; j++) {
                arr[j]=sc.nextInt();
            }
            for (int j = 1; j <= 10 ; j=j+2) {
                if (arr[j]== 1) goalTeam1 ++;
            }
            for (int j = 2; j <= 10 ; j=j+2) {
                if (arr[j]== 1) goalTeam2 ++;
            }
            if (goalTeam1>goalTeam2) System.out.println(1);
            else if (goalTeam1<goalTeam2) System.out.println(2);
            else System.out.println(0);

        }
    }
}
