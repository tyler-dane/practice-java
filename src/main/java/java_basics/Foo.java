package java_basics;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Foo {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validData = false;
        int number=0;
        do {
            System.out.println("Enter a number: ");
            try {
                number = scan.nextInt();
                validData = true;
            } catch (InputMismatchException e){
                System.out.println("Input has to be a number. ");
            }
        } while(!validData);

        System.out.println(number);
    }
}
