package introduction;

import java.util.Scanner;

public class Exercise024_DistanceFromOrigin {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.printf("%.2f", Math.sqrt((long)x * x + (long)y * y));

        sc.close();
    }
}
