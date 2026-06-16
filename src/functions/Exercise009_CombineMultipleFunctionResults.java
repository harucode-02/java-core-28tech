package functions;

import java.util.Scanner;

public class Exercise009_CombineMultipleFunctionResults {
    static boolean chua6(int n) {
        int digit;
        while(n > 0){
            digit = n % 10;
            if(digit == 6){
                return true;
            }
            n /= 10;
        }
        return false;
    }

    static boolean tongchan(int n) {
        int digit;
        int sumDigit = 0;
        while(n > 0){
            digit = n % 10;
            sumDigit += digit;
            n /= 10;
        }
        return sumDigit % 2 == 0;
    }

    static boolean chanle(int n) {
        int digit;
        int countEven = 0;
        int countOdd = 0;

        while (n != 0) {
            digit = n % 10;
            if (digit % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            n /= 10;
        }
        return countOdd > countEven;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b ; i++){
            if(chua6(i) && tongchan(i) && chanle(i)){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
