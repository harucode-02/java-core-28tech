package Conditionals_Operators;

import java.util.Scanner;

public class Exercise003_TemperatureConversion {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        System.out.printf("%.2f",(double) c * 9 / 5 + 32);
        scanner.close();
    }
}
