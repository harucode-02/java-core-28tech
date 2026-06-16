package conditionalsOperators;

import java.util.Scanner;

public class Exercise040_DigitalRoot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(n % 9 == 0 ? 9 : n % 9);

        sc.close();
    }
}
