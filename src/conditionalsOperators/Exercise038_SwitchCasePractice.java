package conditionalsOperators;

import java.util.Scanner;

public class Exercise038_SwitchCasePractice {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        char X = sc.next().charAt(0);

        switch (X) {
            case '+':
                System.out.printf("%d + %d = %d", a, b, a + b);
                break;
            case '-':
                System.out.printf("%d - %d = %d", a, b, a - b);
                break;
            case '*':
                System.out.printf("%d * %d = %d", a, b, a * b);
                break;
            case '/':
                System.out.printf("%d / %d = %.2f", a, b, (double) a / b);
                break;
            case '%':
                System.out.printf("%d %% %d = %d", a, b, a % b);
                break;
        }

        sc.close();
    }
}
