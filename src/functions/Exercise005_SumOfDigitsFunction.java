package functions;

import java.util.Scanner;

public class Exercise005_SumOfDigitsFunction {
    static long sum_digit(long n) {
        long sumDigit = 0;
        long digit;
        while (n > 0) {
            digit = n % 10;
            sumDigit += digit;
            n = n / 10;
        }
        return sumDigit;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        System.out.println(sum_digit(a));
        sc.close();
    }
}
