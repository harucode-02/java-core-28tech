package functions;

import java.util.Scanner;

public class Exercise014_ReverseNumber {
    static long reverse(long n) {
        long digit;
        long result = 0;

        while (n > 0) {
            digit = n % 10;
            result = result * 10 + digit;
            n = n / 10;

        }
        return result;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(reverse(n));

        sc.close();
    }
}
