package codechef500to800Java;


import java.util.Scanner;

public class waterFilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            int B3 = sc.nextInt();
            // Empty means 0 and full means  1
            if (B1+B2+B3<= 1  ) System.out.println("Water filling time");
            else System.out.println("Not now");
        }
    }
}
