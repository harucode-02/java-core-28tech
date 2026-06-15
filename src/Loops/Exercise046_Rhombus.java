package Loops;

import java.util.Scanner;

public class Exercise046_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int k1 = 1; k1 <= 2 * (n - i); k1++){
                System.out.print(" ");
            }
            for(int k2 = 1; k2 <= 2 * i - 1; k2++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= n; i++){
            for(int j1 = 1; j1 <= 2 * i; j1++){
                System.out.print(" ");
            }
            for(int j2 = 1;  j2 <= 2 * (n - i) - 1 ; j2++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
