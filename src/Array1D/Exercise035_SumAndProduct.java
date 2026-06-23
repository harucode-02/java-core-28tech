package Array1D;

import java.util.Scanner;

public class Exercise035_SumAndProduct {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            sum = sum % (1_000_000_007);
        }

        long product = 1;
        for(int i = 0; i < n; i++){
            product *= arr[i];
            product = product  % (1_000_000_007);
        }

        System.out.println(sum);
        System.out.println(product);

        sc.close();
    }

}
