package codechef500to800Java;
import java.util.Scanner;
public class bathInWinters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // capacity of gyser
            int Y = sc.nextInt();   // capacity of bucket
            System.out.println(X/(Y*2));
        }
    }
}
