package Array1D;

import java.util.Scanner;

public class Exercise017_PalindromeNumber {
    static int isPalindrome(int n) {
        int reversed = 0;
        while (n != 0) {
            int temp = n;
            temp %= 10;
            reversed = reversed * 10 + temp;
            n /= 10;
        }
        return reversed;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (isPalindrome(arr[i]) == arr[i]) {
                System.out.println(arr[i]);
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (isPalindrome(arr[i]) == arr[i]) {
                System.out.println(arr[i]);
                break;
            }
        }

        sc.close();
    }
}
