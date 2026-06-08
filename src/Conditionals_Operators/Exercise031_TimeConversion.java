package Conditionals_Operators;

import java.util.Scanner;

public class Exercise031_TimeConversion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long h = n / 3600;
        long m = (n % 3600) / 60;
        long s = n % 60;

        System.out.println(h + "h" + " : " + m + "m" + " : " + s + "s");

        sc.close();
    }
}
