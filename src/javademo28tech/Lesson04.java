package javademo28tech;

import java.util.Scanner;

public class Lesson04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        System.out.printf("%.4f ", (double) 2 * 3.14 * R);
        System.out.printf("%.4f", 3.14 * R * R);

        scanner.close();
    }
}
