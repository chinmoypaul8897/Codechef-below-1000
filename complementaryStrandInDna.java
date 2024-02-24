package codechef500to800Java;

import java.util.Scanner;

public class complementaryStrandInDna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            String S  = sc.next();
            String P = ""; // declare  empty string
            for (int j = 0; j < N ; j++) {
                if (S.charAt(j)== 'A' )    P+= 'T';
                else if (S.charAt(j)=='T') P+='A';
                else if (S.charAt(j)=='C') P+='G';
                else if (S.charAt(j)=='G') P+= 'C';
            }
            System.out.println(P);
        }

    }
}
