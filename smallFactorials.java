package codechef500to800Java;

import java.math.BigInteger;
import java.util.Scanner;

public class smallFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
           int n = sc.nextInt();
           BigInteger ans  = new BigInteger("1") ;
            for (int j = 1; j <= n; j++) {
               ans = ans.multiply(BigInteger.valueOf(j));
            }
            System.out.println(ans);

        }
    }
}
