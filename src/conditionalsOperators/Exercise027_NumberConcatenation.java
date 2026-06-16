package conditionalsOperators;

import java.util.Scanner;

public class Exercise027_NumberConcatenation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k2 = sc.nextLong();
        long k3 = sc.nextLong();
        long k5 = sc.nextLong();
        long k6 = sc.nextLong();

        long k256 = Math.min(k2, Math.min(k5, k6));
        long k32 = Math.min(k3, k2 - k256);

        System.out.printf("%d", (k256 * 256) + (k32 * 32));

        sc.close();
    }
}
