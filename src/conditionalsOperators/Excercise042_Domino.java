package conditionalsOperators;

import java.util.Scanner;

public class Excercise042_Domino {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println(n / 2 * m);
        } else {
            System.out.println(n / 2 * m + m / 2);
        }
        sc.close();
    }
}
