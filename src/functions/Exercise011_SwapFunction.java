package functions;

import java.util.Scanner;

public class Exercise011_SwapFunction {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int temp = x;
        x = y;
        y = temp;

        System.out.println(x + " " + y);
        sc.close();
    }
}
