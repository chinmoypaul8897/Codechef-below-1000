package codechef500to1000Java;

import java.util.Scanner;

public class chefOnHisOffice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // working hours on each day from Monday to Thursday
            int Y = sc.nextInt();  // the number of working hours on Friday
            System.out.println((X*4)+Y);
        }
    }
}
