package codechef500to800Java;

import java.util.Scanner;

public class chefAndSnackdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            if (N==2010 || N==2015|| N==2016 || N==2017 || N==2019  ) System.out.println("HOSTED");
            else System.out.println("NOT HOSTED");
        }
    }
}
