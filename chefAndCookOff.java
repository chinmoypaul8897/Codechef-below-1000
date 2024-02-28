package codechef500to800Java;

import java.util.Scanner;

public class chefAndCookOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            for (int j = 0; j < N ; j++) {
                int count = 0 ;
                for (int k = 0; k < 5 ; k++) {
                    int A = sc.nextInt();
                    if (A==1) count++;
                }
                if (count==0) System.out.println("Beginner");
                else if (count==1) System.out.println("Junior Developer");
                else if (count==2) System.out.println("Middle Developer");
                else if (count==3) System.out.println("Senior Developer");
                else if (count==4) System.out.println("Hacker");
                else System.out.println("Jeff Dean");
            }
        }
    }

