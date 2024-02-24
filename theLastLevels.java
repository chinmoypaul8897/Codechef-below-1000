package codechef500to800Java;

import java.util.Scanner;

public class theLastLevels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // remaining levels
            int Y = sc.nextInt();   // each level takes Y mins
            int Z = sc.nextInt();   // break time after 3 level
            int breakTime = ((X-1)/3)*Z ;
            System.out.println((X*Y) + breakTime);


        }
    }
}
