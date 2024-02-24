package codechef500to1000Java;

import java.util.Scanner;

public class goodWeather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int sunnyDays = 0 ;
            int rainyDays = 0 ;
            for (int j = 0; j < 7; j++) {
                int A = sc.nextInt();
                if (A==1) sunnyDays++;
                else rainyDays++;
            }
            if (sunnyDays>rainyDays) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
