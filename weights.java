package codechef500to1000Java;

import java.util.Scanner;

public class weights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int W = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if (W == X || W == Y || W == Z || W == X+Y || W==Y+Z || W==X+Z || W == X+Y+Z )
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
