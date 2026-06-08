package Introduction;

import java.util.Scanner;

public class Exercise008_Division {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();

        System.out.println(a / b);
        System.out.printf("%.2f",(float) a / b);

        sc.close();
    }
}
