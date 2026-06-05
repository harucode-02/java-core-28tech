package javademo28tech;

import java.util.Scanner;

public class Lesson02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        System.out.println(a * (b + c) + b * (a + c));
        scanner.close();
    }
}
