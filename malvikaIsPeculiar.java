package codechef500to800Java;

import java.util.Scanner;

public class malvikaIsPeculiar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            String S = sc.next();
            int amberCount= 0 ;
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j)=='a') amberCount++;
            }
            int brassCount = S.length()-amberCount;
            if (amberCount>brassCount) System.out.println(brassCount);
            else System.out.println(amberCount);

        }
    }
}
