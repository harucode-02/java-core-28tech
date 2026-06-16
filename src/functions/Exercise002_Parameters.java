package functions;

import java.util.Scanner;

public class Exercise002_Parameters {
    static void display(long x, long y, long z) {
        System.out.println(y + " " + x + " " + z);
        System.out.println(x + y + z);
        System.out.println("KET THUC !");
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();

        display(x, y, z);

        sc.close();
    }
}
