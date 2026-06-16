package loops;

import java.util.Scanner;

public class Exercise003_WritingLoopPractice {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Line 1
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Line 2
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Line 3
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Line 4
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Line 5
        for (int i = 0; i < n; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Line 6
        for (char c = 'a'; c < 'a' + n; c++) {
            System.out.printf("%c ", c);
        }
        System.out.println();

        // Line 7
        for (char c = (char)('z' - n + 1); c <= 'z'; c++) {
            System.out.printf("%c ", c);
        }

        sc.close();
    }
}
