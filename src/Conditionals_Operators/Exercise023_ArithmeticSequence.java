package Conditionals_Operators;

import java.util.Scanner;

public class Exercise023_ArithmeticSequence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long u1 = sc.nextLong();
        long d = sc.nextLong();

        System.out.println(n * (2 * u1 + (n - 1) * d) / 2);

        sc.close();
    }
}
