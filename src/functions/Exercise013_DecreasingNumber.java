package functions;

import java.util.Scanner;

public class Exercise013_DecreasingNumber {
    static boolean so_giam(int n) {
        int digit;
        int next;

        while (n >= 10) {
            digit = n % 10;
            n /= 10;
            next = n % 10;

            if(next <= digit) return false;
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean found = false;
        for(int i = a; i <= b; i++){
            if(so_giam(i)){
                System.out.print(i + " ");
                found = true;
            }
        }
        if(!found){
            System.out.println("28tech");
        }

        sc.close();
    }
}
