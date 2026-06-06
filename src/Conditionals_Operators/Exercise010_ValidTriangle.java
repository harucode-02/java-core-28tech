package Conditionals_Operators;

import java.util.Scanner;

public class Exercise010_ValidTriangle {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if((a > 0 && b > 0 && c > 0) && (a + b > c && b + c > a && c + a > b)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
