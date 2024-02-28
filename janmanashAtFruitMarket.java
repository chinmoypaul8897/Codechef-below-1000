package codechef500to800Java;

import java.util.Scanner;

public class janmanashAtFruitMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // the number of fruits to buy
            int A = sc.nextInt();  // the prices of the three different types of fruits
            int B = sc.nextInt();
            int C = sc.nextInt();
            int min = Math.min(Math.min(A,B),C);
            int max = Math.max(Math.max(A,B),C);
            int secondMin;
            if ((A==min && B==max) || (A==max && B==min)) secondMin=C;
            else if ((B==min && C==max) || (B==max && C==min)) secondMin=A;
            else  secondMin=B;
            System.out.println(min*(X-1)+secondMin);

        }
    }
}
