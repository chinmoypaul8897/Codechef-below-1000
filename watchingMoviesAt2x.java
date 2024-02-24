package codechef500to1000Java;

import java.util.Scanner;

public class watchingMoviesAt2x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();   // total duration
        int Y = sc.nextInt();   // 2x speed till first Y min
        System.out.println((Y/2)+(X-Y));
    }
}
