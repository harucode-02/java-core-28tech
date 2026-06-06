package Conditionals_Operators;

import java.util.Scanner;

public class Exercise018_UpperLowerCaseConversion {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = scanner.next().charAt(0);
        if(c >= 'A' && c <= 'Z'){
            System.out.println((char)(c + 32));
        } else if (c >= 'a' && c <= 'z'){
            System.out.println((char)(c - 32));
        } else {
            System.out.println(c);
        }
        scanner.close();
    }
}
