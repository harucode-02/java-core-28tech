package Conditionals_Operators;

import java.util.Scanner;

public class Exercise036_SumCalculation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int countAlpha = 0;
        int Digit;
        int sumDigit = 0;

        for (int i = 1; i <= n; i++) {
            char c = sc.next().charAt(0);
            if (Character.isLetter(c)) {
                countAlpha++;
            } else if (Character.isDigit(c)) {
                Digit = c - '0';
                sumDigit += Digit;
            }
        }
        System.out.println(countAlpha);
        System.out.println(sumDigit);

        sc.close();
    }
}
