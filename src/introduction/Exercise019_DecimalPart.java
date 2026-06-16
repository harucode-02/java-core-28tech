package introduction;

import java.util.Scanner;

public class Exercise019_DecimalPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double f = sc.nextDouble();

        System.out.println((long)f);
        System.out.printf("%.2f", f - (long)f % 100);

        sc.close();
    }
}
