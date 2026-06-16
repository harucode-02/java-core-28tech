package introduction;

import java.util.Scanner;

public class Exercise027_Divisibility {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(n / 28 + 1);

        sc.close();
    }
}
