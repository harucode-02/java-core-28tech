package Introduction;

import java.util.Scanner;

public class Exercise030_LastThreeDigitsAgain {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long a = n % 10;
        long b = (n / 10) % 10;
        long c = (n / 100) % 10;

        long s = (long)Math.pow(10, a) + (long)Math.pow(5, b) + (long)Math.pow(3, c);

        System.out.println(s);

        sc.close();
    }
}
