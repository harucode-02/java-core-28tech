package Introduction;

import java.util.Scanner;

public class Exercise003_PrintExpression {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x  = sc.nextInt();
        int y  = sc.nextInt();
        long z = sc.nextLong();
        long t = sc.nextLong();

        long sum = (long)x + y + z + t;
        long multi = x - y + z * t;

        System.out.println(y + "," + z + "," + x + "," + t);
        System.out.println(sum);
        System.out.println(multi);

        sc.close();
    }
}
