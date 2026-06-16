package loops;

import java.util.Scanner;

public class Exercise036_SolveEquation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        boolean check = false;

        for(int i = 0; i <= n / a; i++){
            if((n - a * i) % b == 0){
                System.out.println("YES");
                check = true;
                break;
            }
        }
        if(!check) {
            System.out.println("NO");
        }

        sc.close();
    }
}
