package Conditionals_Operators;

import java.util.Scanner;

public class Exercise017_CharacterCheck {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = scanner.next().charAt(0);

        if(c >= 65 && c <= 90){
            System.out.println("UPPER");
        } else if (c >= 97 && c <= 122){
            System.out.println("LOWER");
        } else if (c >= 48 && c <= 57){
            System.out.println("DIGIT");
        } else {
            System.out.println("SPECIAL");
        }
        scanner.close();
    }
}
