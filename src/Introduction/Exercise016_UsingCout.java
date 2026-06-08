package Introduction;

import java.util.Scanner;

public class Exercise016_UsingCout {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        long t = sc.nextLong();

        System.out.println(x + "  " + y + "  " + z + "  " + t);
        System.out.println();
        System.out.println(y + "--" + z + "--" + x + "--" + t);
        System.out.println();
        System.out.println(2 * x + "," + 3 * y + "," + 4 * z + "," + 5 * t);
        System.out.println();
        System.out.println("KET THUC !!");

        sc.close();
    }
}
