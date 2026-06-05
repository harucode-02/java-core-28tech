package javademo28tech;

import java.util.Scanner;

public class Lesson06 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        // Condition-01
        System.out.println(N % 2 == 0 ? "YES" : "NO");
        // Condition-02
        System.out.println(N % 3 == 0 && N % 5 == 0 ? "YES" : "NO");
        // Condition-03
        System.out.println(N % 3 == 0 && N % 7 != 0 ? "YES" : "NO");
        // Condition-04
        System.out.println(N % 3 == 0 || N % 7 == 0 ? "YES" : "NO");
        // Condition-05
        System.out.println(N > 30 && N < 50 ? "YES" : "NO");
        // Condition-06
        System.out.println(N >= 30 && (N % 2 == 0 || N % 3 == 0 || N % 5 == 0) ? "YES" : "NO");
        // Condition-07
        System.out.println((N >= 10 && N <= 99) && (N % 10 == 2 || N % 10 == 3 || N % 10 == 5 || N % 10 == 7) ? "YES" : "NO");
        // Condition-08
        System.out.println(N <= 100 && N % 23 == 0 ? "YES" : "NO");
        // Condition-09
        System.out.println(N < 10 || N > 20 ? "YES" : "NO");
        // Condition-10
        System.out.println((N % 10) % 3 == 0 ? "YES" : "NO");

        scanner.close();
    }
}
