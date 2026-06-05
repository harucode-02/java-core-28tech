package javademo28tech;

import java.util.Scanner;

public class Lesson12 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int y = scanner.nextInt();

        if(m <= 12 && m > 0 && y > 0){
            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
                System.out.println(31);
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                System.out.println(30);
            } else {
                if(m == 2 && ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))){
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            }
        } else {
            System.out.println("INVALID");
        }
        scanner.close();
    }
}
