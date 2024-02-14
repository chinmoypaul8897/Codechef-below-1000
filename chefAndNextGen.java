package codechef500to800Java;

import java.util.Scanner;

public class chefAndNextGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();  //  have to generate A units of power each year
            int B = sc.nextInt();  // for the next B years
            int X = sc.nextInt();  // the moon has X grams of Helium-3
            int Y = sc.nextInt();  //1 gram of Helium-3 can provide Y units of power.
            if ( X*Y >= A * B ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
