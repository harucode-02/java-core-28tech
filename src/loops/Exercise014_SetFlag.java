package loops;

import java.util.Scanner;

public class Exercise014_SetFlag {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean flag = false;
        for(int i = Math.min(a, b); i <= Math.max(a, b); i++){
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                System.out.print(i + " ");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("28tech");
        }
        sc.close();
    }
}
