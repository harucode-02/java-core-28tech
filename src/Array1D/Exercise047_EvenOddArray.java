package Array1D;

import java.util.Scanner;

public class Exercise047_EvenOddArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10000];

        int n = 0;
        while(sc.hasNextInt()){
            arr[n++] = sc.nextInt();
        }

        int countOdd = 0;
        int countEven = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0) countEven++;
            else countOdd++;
        }

        if(countEven > countOdd){
            System.out.println("CHAN");
        } else if (countEven == countOdd){
            System.out.println("CHANLE");
        } else {
            System.out.println("LE");
        }

        sc.close();
    }
}
