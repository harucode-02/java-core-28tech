package conditionalsOperators;

import java.util.Scanner;

public class Exercise024_GeometricSequence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        if (b % a == 0) {
            long q = b / a;
            if (b * q == c && c * q == d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
