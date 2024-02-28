package codechef500to800Java;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class rearrangeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int D = sc.nextInt();  // no of digits in N
            String S = sc.next();
            char [] C = S.toCharArray();
            boolean flag = false ;
            for (int j = 0; j < D; j++) {
                if (C[j]=='0' || C[j]=='5') flag = true ;

            }
            if (flag==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
