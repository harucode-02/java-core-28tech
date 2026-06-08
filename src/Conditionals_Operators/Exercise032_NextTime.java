package Conditionals_Operators;

import java.util.Scanner;

public class Exercise032_NextTime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int total = h * 28 + m + k;
        int remain = total % 784;
        int a = remain / 28;
        int b = remain % 28;

        System.out.printf("%02dh:%02dm", a, b);

        sc.close();
    }
}
