package conditionalsOperators;

import java.util.Scanner;

public class Exercise013_ConvertDaysToYearsWeeksDays {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int y = n / 365;
        int w = (n % 365) / 7;
        int d = (n % 365) % 7;
        System.out.printf("%d %d %d", y, w, d);

        scanner.close();
    }
}
