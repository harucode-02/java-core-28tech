package javademo28tech;

import java.util.Scanner;

public class Lesson02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long y = scanner.nextLong();
        char c = scanner.next().charAt(0);
        float f = scanner.nextFloat();
        double d = scanner.nextDouble();
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.printf("%.2f\n", f);
        System.out.printf("%.9f\n", d);
    }
}
