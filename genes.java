package codechef500to1000Java;

import java.util.Scanner;

public class genes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        if (A.equals(B)) System.out.println(A);
        else if (A.equals("R") || B.equals("R")) System.out.println("R");
        else System.out.println("B");

    }
}
