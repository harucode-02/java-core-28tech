package javademo28tech;

import java.util.Scanner;

public class Lesson07 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d %d", a / b * b, a % b == 0 ? a : (a / b + 1) * b);
        scanner.close();
    }
}
