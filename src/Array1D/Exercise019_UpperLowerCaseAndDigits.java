package Array1D;

import java.util.Scanner;

public class Exercise019_UpperLowerCaseAndDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] arr = new char[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        int countLowerCase = 0;
        int countUpperCase = 0;
        int countNumber = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isLowerCase(arr[i])) {
                countLowerCase++;
            } else if (Character.isUpperCase(arr[i])) {
                countUpperCase++;
            } else if (Character.isDigit(arr[i])) {
                countNumber++;
            }
        }

        System.out.print(countLowerCase + " ");
        System.out.print(countUpperCase + " ");
        System.out.print(countNumber);

        sc.close();
    }
}
