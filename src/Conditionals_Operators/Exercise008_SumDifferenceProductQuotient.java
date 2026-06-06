package Conditionals_Operators;

import java.util.Scanner;

public class Exercise008_SumDifferenceProductQuotient {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(1L * a * b);
        if(b == 0){
            System.out.println("INVALID");
        } else {
            System.out.printf("%.4f", (double) a / b);
        }
        scanner.close();
    }
}
