package Conditionals_Operators;

import java.util.Scanner;

public class Excercise041 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x  = sc.nextInt();
        int y  = sc.nextInt();
        int z = sc.nextInt();

        // Dieu kien 1
        if (x == y && x == z) {
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        // Dieu kien 2
        if ((x % 2 == 0 && y % 2 == 0) || (y % 2 != 0 && x % 2 != 0) ) {
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        // Dieu kien 3
        if(Math.max(Math.max(x,y),z) % 3 == 0){
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        // Dieu kien 4
        if((x + y < z) || (y + z < x) || (z + x < y)) {
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        // Dieu kien 5
        long product = (long)x * y * z;
        if(Math.abs(product % 10) == 2 || Math.abs(product % 10) == 3 ||  Math.abs(product % 10) == 5 || Math.abs(product % 10) == 7 ) {
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        // Dieu kien 6
        if(x != y && x != z && y != z){
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        // Dieu kien 7
        if ((x % 2 == 0 && y % 2 == 0 && z % 2 == 0) || (y % 2 != 0 && x % 2 != 0 && z % 2 != 0) ) {
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        // Dieu kien 8
        if ((Math.max(Math.max(x,y),z) + Math.min(Math.min(x, y), z)) % 3 == 0 ||
                (Math.max(Math.max(x,y),z) + Math.min(Math.min(x, y), z)) % 5 == 0){
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        // Dieu kien 9
        if(Math.abs(x - y) == Math.abs(y - z)){
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        // Dieu kien 10
        if((long) x * y > (long)z * z){
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        sc.close();
    }
}
