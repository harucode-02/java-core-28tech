package Loops;

import java.util.Scanner;

public class Exercise030_IntegerRepresentation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(-1);
        } else if (n % 2 == 0) {
            System.out.println(n / 2);
            for (int i = 1; i <= n / 2; i++) {
                System.out.print(2 + " ");
            }
        } else {
            System.out.println((n - 3) / 2 + 1);
            for (int i = 1; i <= (n - 3) / 2; i++) {
                System.out.print(2 + " ");
            }
            System.out.println(3);
        }

        sc.close();
    }
}
