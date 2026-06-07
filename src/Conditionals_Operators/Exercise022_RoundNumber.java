package Conditionals_Operators;

import java.util.Scanner;

public class Exercise022_RoundNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        System.out.println(Math.round(a));

        sc.close();
    }
}
