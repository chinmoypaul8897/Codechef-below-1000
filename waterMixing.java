package codechef500to1000Java;

import java.util.Scanner;

public class waterMixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();  // the initial temperature of bathtub
            int B = sc.nextInt();  // the desired temperature of bathtub
            int X = sc.nextInt();  // the amount of hot water in litres
            int Y = sc.nextInt();  // the amount of cold water in litres\
            int tempDifference= A - B ;
            if (tempDifference > 0 && tempDifference <= Y  )
                System.out.println("YES");
            else if (tempDifference < 0 && (tempDifference*(-1))<= X)
                System.out.println("YES");
            else if (tempDifference==0) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
