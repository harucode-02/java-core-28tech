package Introduction;

import java.util.Scanner;

public class Exercise004_PowFunction {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println((long)Math.pow(x, y));

        sc.close();
    }
}
