package Introduction;

import java.util.Scanner;

public class Exercise029_LastThreeDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long a = n % 10;
        long b = (n / 10) % 10;
        long c = (n / 100) % 10;

        System.out.println(Math.max(a, Math.max(b, c)));

        sc.close();
    }
}
