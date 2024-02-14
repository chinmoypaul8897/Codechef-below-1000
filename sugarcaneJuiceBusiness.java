package codechef500to800Java;

import java.util.Scanner;

public class sugarcaneJuiceBusiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt(); // no of glasses sold
            int ti = N * 50 ;
            System.out.println(ti - (ti/5)-(ti/5)-((ti*3)/10));
        }
    }
}
