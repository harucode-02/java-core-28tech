package Conditionals_Operators;

import java.util.Scanner;

public class Exercise028_SplitTheBill {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        int each = (a + b + c  + n) / 3;

        System.out.println((a + b + c + n) % 3 == 0 && each >= a && each >= b && each >= c ? "YES" : "NO");

        sc.close();
    }
}
