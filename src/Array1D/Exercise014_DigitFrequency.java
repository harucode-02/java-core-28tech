package Array1D;

import java.util.Scanner;

public class Exercise014_DigitFrequency {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long [] arr = new long[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }

        long [] count = new long[10];
        for(int i = 0; i < n; i++){
            if(arr[i] == 0) count[0]++;
            while(arr[i] > 0) {
                long temp = arr[i];
                temp %= 10;
                count[(int)temp]++;
                arr[i] /= 10;
            }
        }

        for(int i = 0; i <= 9; i++){
            if(count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }

        sc.close();
    }
}
