package Loops;

import java.util.Scanner;

public class Exercise044_IsoscelesTriangleNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }
            for(int k1 = i; k1 <= 2 * i - 1; k1++){
                System.out.print(" " + k1);
            }
            for(int k2 = 2 * i - 2; k2 >= i; k2--){
                System.out.print(" " + k2);
            }
            System.out.println();
        }

        sc.close();
    }
}
