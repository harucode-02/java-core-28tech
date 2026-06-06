package Conditionals_Operators;

import java.util.Scanner;

public class Exercise004_CirclePerimeterAndArea {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        System.out.printf("%.4f ", (double) 2 * 3.14 * R);
        System.out.printf("%.4f", 3.14 * R * R);

        scanner.close();
    }
}
