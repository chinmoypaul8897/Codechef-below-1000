package codechef500to800Java;
import java.util.Scanner;

public class twoRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T  ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int [] arr = {0,1,2,3,4,5,6,7,8};
            for (int j = A; j <=B ; j++) {
                for (int k = 1; k <= 8 ; k++) {
                    if (arr[k]==j) arr[k]=-1;
                }
            }
            for (int j = C; j <=D ; j++) {
                for (int k = 1; k <= 8 ; k++) {
                    if (arr[k]==j) arr[k]=-1;
                }
            }
            int count=0;
            for (int j = 1; j <= 8 ; j++) {
                if (arr[j]==-1) count++;
            }
            System.out.println(count);
        }
    }
}
