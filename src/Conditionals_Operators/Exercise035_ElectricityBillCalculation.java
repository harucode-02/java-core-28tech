package Conditionals_Operators;

import java.util.Scanner;

public class Exercise035_ElectricityBillCalculation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n >= 1000) {
            System.out.println((n * 4500) + 1_200_000);
        } else if (n >= 800) {
            System.out.println((n * 3900) + 900_000);
        } else if (n >= 500) {
            System.out.println((n * 3700) + 800_000);
        } else {
            System.out.println((n * 3300));
        }

        sc.close();
    }
}
