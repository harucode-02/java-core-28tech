package conditionalsOperators;

import java.util.Scanner;

public class Exercise007_MaxAndMinNumber {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d %d", a / b * b, a % b == 0 ? a : (a / b + 1) * b);
        scanner.close();
    }
}
