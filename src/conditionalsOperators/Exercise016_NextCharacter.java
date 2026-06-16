package conditionalsOperators;

import java.util.Scanner;

public class Exercise016_NextCharacter {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = scanner.next().charAt(0);

        if(c == 'Z' || c == 'z'){
            System.out.println('a');
        } else if (c >= 65 && c <= 90 || c >= 97 && c <= 122){
            System.out.println((char)(Character.toLowerCase(c) + 1));
        }

        scanner.close();
    }
}
