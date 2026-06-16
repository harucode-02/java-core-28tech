package introduction;

import java.util.Scanner;

public class Exercise014_NumberInRange {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(b - a + 1);

        sc.close();
    }
}
