package conditionalsOperators;

import java.util.Scanner;

public class Exercise009_LeapYearCheck {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        System.out.println(x % 400 == 0 || (x % 4 == 0 && x % 100 != 0) ? "YES" : "NO");

        scanner.close();
    }
}
