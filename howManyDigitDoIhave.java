package codechef500to800Java;

import java.util.Scanner;

public class howManyDigitDoIhave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            if (N > 0 && N < 10 ) System.out.println("1");
            else if (N >= 10 && N < 100) System.out.println(2);
            else if (N >= 100 && N < 1000) System.out.println(3);
            else System.out.println("More than 3 digits");
        
    }
}
