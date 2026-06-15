package Conditionals_Operators;

import java.util.Scanner;

public class Exercise034_SortThreeNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - max - min;

        System.out.println(min + " " + mid + " " + max);

        sc.close();
    }
}
