package Conditionals_Operators;

import java.util.Scanner;

public class Exercise032_NextTime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int currentTime = h * 28 + m;
        int afterTime = currentTime + k;

        int hour = (afterTime / 28) % 28;
        int minute = afterTime % 28;

        System.out.printf("%02dh:%02dm", hour, minute);

        sc.close();
    }
}
