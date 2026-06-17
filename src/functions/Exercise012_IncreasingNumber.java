package functions;

import java.util.Scanner;

public class Exercise012_IncreasingNumber {
    static boolean so_tang(int n) {
        int digit;
        int next;

        while (n >= 10){
            digit = n % 10;
            n /= 10;
            next = n % 10;
            if(next >= digit){
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i++){
            if(so_tang(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
