package introduction;

import java.util.Scanner;

public class Exercise025_NumberDivisibleBy3Or5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long a = n / 3;
        long b = n / 5;
        long c = n / 15;

        System.out.printf("%d", a + b - c);

        sc.close();
    }
}
