package Loops;

import java.util.Scanner;

public class Exercise002_ForLoop2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for(int i = 1; i <= n; i *= 2){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = n; ; i++){
            if(i % 17 == 0){
                System.out.println(i);
                break;
            }
        }
        for(int i = n - 1; i >= 0; i--){
            if(i % 7 == 0){
                System.out.println(i);
                break;
            }
        }

        int num = 1;
        int step = 1;
        while (num <= n) {
            System.out.print(num + " ");
            num += step;
            step++;
        }

        sc.close();
    }
}
