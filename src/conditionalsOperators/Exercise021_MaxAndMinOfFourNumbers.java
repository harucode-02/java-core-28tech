package conditionalsOperators;

import java.util.Scanner;

public class Exercise021_MaxAndMinOfFourNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long max = Math.max(Math.max(a, b), Math.max(c, d));
        long min = Math.min(Math.min(a, b), Math.min(c, d));

        System.out.printf("%d %d", max, min);

        sc.close();
    }
}
