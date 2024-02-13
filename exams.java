package codechef500to800Java;

import java.util.Scanner;

public class exams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // no of schools
            int Y = sc.nextInt();  // no of students
            int Z = sc.nextInt();  // no of students passed
            if (Z > (X*Y)/2) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
