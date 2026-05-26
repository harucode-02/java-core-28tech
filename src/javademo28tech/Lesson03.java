package javademo28tech;

import java.util.Scanner;

public class Lesson03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        int chuVi = 2 * (a + b);
        long dienTich = 1L * a * b;
        System.out.println("Chu vi HCN la : " + chuVi);
        System.out.println("Dien tich HCN la : " + dienTich);
    }
}
