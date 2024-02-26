package codechef500to800Java;

import java.util.Scanner;

public class secretRecipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++)   {
             float X1 = sc.nextInt();
            float X2 = sc.nextInt();
            float X3 = sc.nextInt();
            float V1 = sc.nextInt();
            float  V2 = sc.nextInt();
            float chefTime = (X3 - X1) / V1;
            float kTime = (X2 - X3) /V2;
            if(chefTime < kTime) System.out.println("Chef");
            else if ( chefTime > kTime) System.out.println("Kefa");
            else System.out.println("Draw");

        }
    }
}
