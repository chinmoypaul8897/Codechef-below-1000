package codechef500to800Java;

import java.util.Scanner;

public class equalizingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            boolean flag = false ;
            for (int d = 0; d < Math.max(A,B); d++) {
                if ((A-d)==(B+d) || (A+d)==(B-d)) flag=true;
                break;
            }
            if (flag==true) System.out.println("YES");
            else System.out.println("No");


        }
    }
}
