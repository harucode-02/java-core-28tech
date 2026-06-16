package conditionalsOperators;

import java.util.Scanner;

public class Exercise005_EuclideanDistance {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        long dx = (long)(x2 - x1);
        long dy = (long)(y2 - y1);

        System.out.printf("%.2f", Math.sqrt(dx * dx + dy * dy));
        scanner.close();
    }
}
