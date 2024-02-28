package codechef500to800Java;

import java.util.Scanner;

public class amILucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // the total number of students
            int X = sc.nextInt();  // the number of boys
            int K = sc.nextInt();  // the number of students in each trekking group
            int Y  = N - X ;   // NO OF GIRLS
            int leftBoys = (X%K);
            int leftGirls= (Y%K);
            if (leftBoys<leftGirls) System.out.println(leftGirls-leftBoys);
            else if (leftBoys>leftGirls) System.out.println(leftBoys-leftGirls);
            else System.out.println(0);
        }
    }
}
