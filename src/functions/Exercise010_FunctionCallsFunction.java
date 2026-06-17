package functions;

import java.util.Scanner;

public class Exercise010_FunctionCallsFunction {
    static boolean chanle(int n) {
        int digit;
        int countEven = 0;
        int countOdd = 0;

        while (n != 0) {
            digit = n % 10;
            if (digit % 2 == 0) countEven++;
            else countOdd++;
            n /= 10;
        }
        return countEven > countOdd;
    }

    static boolean check(int n) {
        int digit;
        int sum = 0;
        while (n != 0) {
            digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return chanle(sum);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            if(check(i)){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
