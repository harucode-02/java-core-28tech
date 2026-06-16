package loops;

import java.util.Scanner;

public class Exercise004_WhileLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Line 01
        int i = 3;
        while (i <= n) {
            System.out.print(i + " ");
            i += 3;
        }
        System.out.println();

        // Line 02
        i = 0;
        while (i < n) {
            System.out.print(i + " ");
            i += 15;
        }
        System.out.println();

        // Line 03
        for (i = n; ; i++) {
            if(i % 7 == 0){
                System.out.println(i);
                break;
            }
        }

        // Line 04
        for(i = n; i >= 0; i--){
            if(i % 9 == 0) {
                System.out.println(i);
                break;
            }
        }

        // Line 05
        i = 1;
        while (i <= 2 * n - 1) {
            System.out.print(i + " ");
            i += 2;
        }

        sc.close();
    }

}
