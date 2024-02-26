package codechef500to800Java;

import java.util.Scanner;

public class countHoliday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // no of festival days
            int holidays = 8 ;
            int [] fes = new int[N];
            for (int j = 0; j < N ; j++) {
                fes[j]=sc.nextInt();
                if (fes[j] != 6 && fes[j] != 13  && fes[j] != 20  && fes[j] != 27   && fes[j] % 7 != 0 )
                    holidays++;

            }
            System.out.println(holidays);
        }
    }
}
