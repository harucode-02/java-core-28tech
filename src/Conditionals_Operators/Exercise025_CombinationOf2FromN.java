package Conditionals_Operators;

import java.util.Scanner;

public class Exercise025_CombinationOf2FromN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        System.out.println(n * (n - 1) / 2);

        sc.close();
    }
}
