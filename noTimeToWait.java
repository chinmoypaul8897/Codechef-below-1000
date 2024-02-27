package codechef500to800Java;

import java.util.Scanner;

public class noTimeToWait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();    // no of time zones
            int H = sc.nextInt();   // needed hours to solve the problem
            int x = sc.nextInt();   // time left
            int totalNeedTime = H - x ;
            boolean flag = false ;
            int [] arr = new int[N];
            for (int j = 0; j < N ; j++) {
                arr[j] = sc.nextInt();
                if (arr[j]==totalNeedTime) flag = true ;
            }
            if (flag==true) System.out.println("YES");
            else System.out.println("NO");

    }
}
