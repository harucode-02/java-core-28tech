package Conditionals_Operators;

import java.util.Scanner;

public class Exercise011_TriangleTypeCheck {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a > 0 && b > 0 && c > 0) && (a + b > c && b + c > a && c + a > b)) {
            if(a == b && b == c){
                System.out.println(1);
            } else if (a == b || b == c || c == a) {
                System.out.println(2);
            } else if (((a > b && a > c) && (a * a == b * b + c * c)) ||
                       ((b > a && b > c) && (b * b == a * a + c * c)) ||
                       ((c > a && c > b) && (c * c == b * b + a * a))){
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        } else {
            System.out.println("INVALID");
        }
        scanner.close();
    }
}
