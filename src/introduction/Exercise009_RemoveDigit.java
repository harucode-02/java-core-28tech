package introduction;

import java.util.Scanner;

public class Exercise009_RemoveDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        System.out.println(n / 1000);

        sc.close();
    }
}
