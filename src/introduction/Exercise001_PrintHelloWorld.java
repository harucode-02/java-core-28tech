package introduction;

import java.util.Scanner;

public class Exercise001_PrintHelloWorld {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println(x);
        System.out.println("Hello World !");
        System.out.println("28tech C++ programming !");

        sc.close();
    }
}
