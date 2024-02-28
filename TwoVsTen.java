package codechef500to800Java;

import java.util.Scanner;

public class TwoVsTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int  X = sc.nextInt();
            int count=0;
            if (X%10!=0)
            {
                X=X*2;
                count++;
            }
            if (X%10==0)System.out.println(count);
            else System.out.println(-1);
        }
    }
}
