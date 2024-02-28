package codechef500to800Java;


import java.util.Scanner;

public class nonNegetiveProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int [] A = new int[N];
            int count = 0 ;
            boolean flag = false ;
            for (int j = 0; j < N; j++) {
                A[j]=sc.nextInt();
                if (A[j]==0) {
                    flag=true;

                }
                else if (A[j]< 0 ) count++;
            }
            if (flag==true || count%2==0) System.out.println(0);
            else System.out.println(1);
        }

    }
}
