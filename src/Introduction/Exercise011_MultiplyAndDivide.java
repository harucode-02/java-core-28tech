package Introduction;

import java.util.Scanner;

public class Exercise011_MultiplyAndDivide {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n * 2);
        System.out.println();
        System.out.println((long)n * 10);
        System.out.println();
        System.out.println(n / 2);
        System.out.println();
        System.out.printf("%.3f", (double)n / 2);
        System.out.println();

        sc.close();
    }
}
