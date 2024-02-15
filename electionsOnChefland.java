package codechef500to800Java;

import java.util.Scanner;

public class electionsOnChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  //  the number of people in Chefland
            int X = sc.nextInt();   // min age for voting
            int [] arr = new int[N];
            int count = 0 ;
            for (int j = 0; j < N ; j++) {
                arr[j]=sc.nextInt();
                if (arr[j] >= X) count++;
            }
            System.out.println(count);
        }
    }
}
