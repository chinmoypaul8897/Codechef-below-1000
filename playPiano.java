package codechef500to800Java;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class playPiano {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           String S = sc.next();
           boolean flag = true ;
            for (int j = 0; j < S.length(); j=j+2) {
                if (S.charAt(j)==S.charAt(j+1)) flag=false;

            }
            if (flag==false) System.out.println("no");
            else System.out.println("yes");

        }
    }
}
