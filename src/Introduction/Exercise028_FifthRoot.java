package Introduction;

import java.util.Scanner;

public class Exercise028_FifthRoot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.printf("%.2f", Math.pow(n, 1.0 / 5));

        sc.close();
    }
}
