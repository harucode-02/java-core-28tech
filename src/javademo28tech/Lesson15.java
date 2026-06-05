package javademo28tech;

import java.util.Scanner;

public class Lesson15 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a * 2 < b) {
            System.out.println(n * a);
        } else {
            if (n % 2 == 0) {
                System.out.println((n / 2) * b);
            } else {
                System.out.println((n / 2) * b + a);
            }
        }
        scanner.close();
    }
}
