package introduction;

import java.util.Scanner;

public class Exercise021_RectangularBoxVolume {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long s = a * b * c;

        System.out.println(s);

        sc.close();
    }
}
