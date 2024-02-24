package codechef500to1000Java;
import java.util.Scanner;

public class chefAndHisApps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int S = sc.nextInt();   // the total memory of Chef's phone
            int X = sc.nextInt(); // the memory occupied first app
            int Y = sc.nextInt();  // the memory occupied Second  app
            int Z = sc.nextInt();  // the memory required by the third app
            int totalMemoryLeft = S - (X+Y);
            if (totalMemoryLeft >= Z ) System.out.println(0);
            else if (totalMemoryLeft + X >= Z || totalMemoryLeft + Y >= Z) System.out.println(1);
            else if (totalMemoryLeft + X +Y >= Z) System.out.println(2);



        }
    }
}
