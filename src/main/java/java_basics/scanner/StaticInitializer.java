package java_basics.scanner;

import java.util.Scanner;

/** Enter two ints on terminal (one per line) to run */
public class StaticInitializer {
    static Scanner input = new Scanner(System.in);
    static boolean flag = true;
    static int B = input.nextInt();
    static int H = input.nextInt();

    static {
        try {
            if ( B <= 0 || H <= 0 ) {
                flag = false;
                throw new Exception("Breadth and Height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if ( flag ) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
