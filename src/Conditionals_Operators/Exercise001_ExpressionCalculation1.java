package Conditionals_Operators;

import java.util.Scanner;

public class Exercise001_ExpressionCalculation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        System.out.print(x * x * x + 3 * x * x + x + 1);
        scanner.close();
    }
}
