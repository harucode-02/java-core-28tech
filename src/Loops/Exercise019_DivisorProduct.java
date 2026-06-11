package Loops;

import java.util.Scanner;

public class Exercise019_DivisorProduct {
    static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int sumProduct = 1;

            for(int i = 1; i <= n; i++){
                if (n % i == 0){
                    sumProduct *= i;
                }
            }
            System.out.println(sumProduct);

            sc.close();
    }
}
