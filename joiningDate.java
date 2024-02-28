package codechef500to800Java;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class joiningDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int totalSlots = 0;
            if (N%5 == 0) totalSlots=N/5;
            else totalSlots=(N/5)+1;
            int slotNoOfK = 0;
            if (K%5==0) slotNoOfK=K/5;
            else  slotNoOfK = (K/5)+1;
            System.out.println(totalSlots-slotNoOfK);

        }
    }
}
