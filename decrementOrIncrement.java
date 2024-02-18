package codechef500to800Java;

import java.util.Scanner;

public class decrementOrIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  N = sc.nextInt();
        if (N % 4 == 0 ) N++;
        else N--;
        System.out.println(N);
    }
}
