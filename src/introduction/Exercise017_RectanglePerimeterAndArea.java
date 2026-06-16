package introduction;

import java.util.Scanner;

public class Exercise017_RectanglePerimeterAndArea {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long d = sc.nextLong();
        long r = sc.nextLong();

        long cv = (d + r) * 2;
        long dt = d * r;

        System.out.println("Chu vi HCN la : " + cv);
        System.out.println("Dien tich HCN la : " + dt);

        sc.close();
    }
}
