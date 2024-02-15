package codechef500to800Java;

import java.util.Scanner;

public class airConditionarTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();  // AT LEAST A
            int B = sc.nextInt();  // AT MOST B
            int C = sc.nextInt();    // AT LEAST C
            if (B >= A && B >= C ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
