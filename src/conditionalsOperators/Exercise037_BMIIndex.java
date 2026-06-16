package conditionalsOperators;

import java.util.Scanner;

public class Exercise037_BMIIndex {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        double h = height / 100.0;
        double bmi = weight / (h * h);

        if (bmi < 18.5) {
            System.out.println("Under weight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Over weight");
        } else if (bmi < 35) {
            System.out.println("Obesity 1");
        } else if (bmi < 40) {
            System.out.println("Obesity 2");
        } else {
            System.out.println("Extreme obesity");
        }

        sc.close();
    }
}
