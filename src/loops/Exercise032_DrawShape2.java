package loops;

import java.util.Scanner;

public class Exercise032_DrawShape2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j1 = 1; j1 <= n - i; j1++) {
                System.out.print(" ");
            }
            for(int j2 = 1; j2 <= i; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j1 = 1; j1 <= i - 1; j1++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= n - i + 1; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i == 1 || i == n || j == 1 || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
