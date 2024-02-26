package codechef500to800Java;

import java.util.Scanner;

public class peacefulParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int Pa = sc.nextInt();
            int Pb = sc.nextInt();
            int Pc = sc.nextInt();
            if (Pb > Pa+Pc) System.out.println(Pb);
            else System.out.println(Pa+Pc);
        }
    }
}
