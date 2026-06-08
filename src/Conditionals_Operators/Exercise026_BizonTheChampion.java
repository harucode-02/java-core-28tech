package Conditionals_Operators;

import java.util.Scanner;

public class Exercise026_BizonTheChampion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();

        int n = sc.nextInt();

        int totalCup = a1 + a2 + a3;
        int totalMedal = b1 + b2 + b3;

        int cupShelves = totalCup % 5 == 0 ? totalCup / 5 : totalCup / 5 + 1;
        int medalShelves = totalMedal % 10 == 0 ? totalMedal / 10 : totalMedal / 10 + 1;

        int totalShelves = cupShelves + medalShelves;
        if (totalShelves <= n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
