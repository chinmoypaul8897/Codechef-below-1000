package codechef500to1000Java;

import java.util.Scanner;

public class minimumPizzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N =sc.nextInt();   // no of people
            int X = sc.nextInt();  // needed slices for each person
            int tns = N * X ;
            if (tns < 4 ) System.out.println(1);
            else if (tns%4== 0 ) System.out.println(tns/4);
            else  System.out.println((tns/4)+1);
        }
    }
}
