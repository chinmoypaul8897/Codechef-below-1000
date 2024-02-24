package codechef500to1000Java;

import java.util.Scanner;

public class mahasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N+1];
        int lucky= 0 ;
        int unlucky = 0 ;
        for (int i = 1; i <= N ; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0 ) lucky++;
            else unlucky++;
        }
       if (lucky>unlucky) System.out.println("READY FOR BATTLE");
       else System.out.println("NOT READY");

    }
}
