package codechef500to800Java;

import java.util.Scanner;

public class meltGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // melting point
            int Y = sc.nextInt();   // initial temperature
            int a = 0 ;
            int  b = 1 ;
            while (Y < X )
            {
                    Y = Y + b ;
                    a++;
                    b++;

            }
            System.out.println(a);
        }
    }
}
