package codechef500to1000Java;

import java.util.Scanner;

public class buy2Get1Free {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // min no of items to buy
            int X = sc.nextInt();   // cost of 1 item
            int actualPayItems = N /3 *(2*X);
            int extraItemsPay = (N%3)*X;
            System.out.println(actualPayItems+extraItemsPay);
        }
    }
}
