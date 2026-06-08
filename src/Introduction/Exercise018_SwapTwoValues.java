package Introduction;

import java.util.Scanner;

public class Exercise018_SwapTwoValues {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long tmp = a;
        a = b;
        b = tmp;

        System.out.println(128 * a + 97 * b + 1000);

        sc.close();
    }
}
