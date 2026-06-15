package Conditionals_Operators;

import java.util.Scanner;

public class Exercise029_TheGenerosity {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();
        int c5 = sc.nextInt();

        System.out.println((c1 + c2 + c3 + c4 + c5) % 5 == 0
                           && (c1 + c2 + c3 + c4 + c5) / 5 != 0
                           ? (c1 + c2 + c3 + c4 + c5) / 5 : -1);
        sc.close();
    }
}
