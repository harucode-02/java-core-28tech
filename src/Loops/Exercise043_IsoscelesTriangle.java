package Loops;

import java.util.Scanner;

public class Exercise043_IsoscelesTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j1 = 1; j1 <= 2 * (n - i); j1++){
                System.out.print(" ");
            }
            for(int j2 = 1; j2 <= 2 * i - 1; j2++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
