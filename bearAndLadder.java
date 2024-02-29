package codechef500to800Java;

import java.util.Scanner;

public class bearAndLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        boolean flag = false ;
        for (int i = 0; i < Q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a>b)           // swap the numbers
            {
                int temp = a;
                a=b;
                b=temp;
            }
          if ((a%2!=0 && b-a==1) || b-a == 2 )
              System.out.println("YES");
          else System.out.println("NO");

        }
    }
}
