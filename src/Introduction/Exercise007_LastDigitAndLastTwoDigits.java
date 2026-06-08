package Introduction;

import java.util.Scanner;

public class Exercise007_LastDigitAndLastTwoDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(n % 10);
        System.out.println(n % 100);

        sc.close();
    }
}
