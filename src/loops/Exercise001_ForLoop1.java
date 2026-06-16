package loops;

import java.util.Scanner;

public class Exercise001_ForLoop1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Hello 28tech");
        }

        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 0; i <= n - 1; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = n; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = n - 1; i > -1; i--){
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
