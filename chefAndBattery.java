package codechef500to800Java;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class chefAndBattery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // current battery level
            if (N < 50 )
            {
                if ((50 - N) % 2 == 0 ) System.out.println((50 - N)/ 2 );
                else System.out.println(((50 - N)/ 2 )+3);
            }
            else {
                if ((N - 50) % 3 == 0 ) System.out.println((N - 50)/3);
                else System.out.println(((N - 50)/3)+((N-50)%3)*2);
            }
        }
    }
}
