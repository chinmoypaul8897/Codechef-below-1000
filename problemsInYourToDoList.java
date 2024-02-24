package codechef500to1000Java;

import java.util.Scanner;

public class problemsInYourToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // the total number of problems that the Chef has added to his to-do list.
            int [] arr = new int[N];
            int count = 0 ;
            for (int j = 0; j < N ; j++) {
               arr[j]=sc.nextInt();
               if (arr[j] >=  1000 ) count++;
            }
            System.out.println(count);
        }
    }
}
