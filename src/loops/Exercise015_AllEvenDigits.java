package loops;

import java.util.Scanner;

public class Exercise015_AllEvenDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long digit;
        boolean isEven = true;

        while (n > 0) {
            digit = n % 10;
            if (digit % 2 != 0) {
                isEven = false;
                break;
            } else {
                n = n / 10;
            }
        }
        if (isEven) {
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        sc.close();
    }
}
