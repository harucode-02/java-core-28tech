package loops;

import java.util.Scanner;

public class Exercise033_DrawShape3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i - 1) * n + j + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((i + j - 1) + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= n; i++){
            for(int j1 = 1; j1 <= n - i; j1++){
                System.out.print("~");
            }
            for(int j2 = 1; j2 <= i; j2++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= n; i++){
            int init = i;
            int dis = n - 1;
            for(int j = 1; j <= i; j++){
                System.out.print(init + " ");
                init += dis;
                dis--;
            }
            System.out.println();
        }

        sc.close();
    }

}
