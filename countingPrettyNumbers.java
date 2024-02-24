package codechef500to1000Java;

import java.util.Scanner;

public class countingPrettyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int L = sc.nextInt();   // L < R
            int R = sc.nextInt();
            int count = 0 ;
            for (int j = L; j <= R; j++) {
                int lastDigit = j % 10  ;
                if (lastDigit==2 || lastDigit==3 || lastDigit==9 ) count++;
            }
            System.out.println(count);
        }
    }
}
