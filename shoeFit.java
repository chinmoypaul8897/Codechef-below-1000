package codechef500to800Java;

import java.util.Scanner;

public class shoeFit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if ((A==0 || B==0 ||C==0 )&& (A==1 || B==1 || C==1) )
                System.out.println(1);
            else System.out.println(0);
        }
    }
}
