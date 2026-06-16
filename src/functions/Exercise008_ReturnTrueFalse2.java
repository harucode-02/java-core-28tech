package functions;

import java.util.Scanner;

public class Exercise008_ReturnTrueFalse2 {
    static boolean so_dep(int n) {
        int countOdd = 0;
        int countEven = 0;
        int digit;

        while (n != 0){
            digit = n % 10;
            if(digit % 2 == 0){
                countEven++;
            } else if(digit % 2 == 1){
                countOdd++;
            }
            n = n / 10;
        }
        return countOdd == countEven;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 10; i <= n; i++){
            if(so_dep(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
