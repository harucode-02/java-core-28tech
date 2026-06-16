package conditionalsOperators;

import java.util.Scanner;

public class Exercise030_HappyNewYear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        System.out.println((60 * 24) - (60 * h + m));

        sc.close();
    }
}
