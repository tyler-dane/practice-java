package java_basics.recursion.triangle;

import java.io.*;


/**
 * this simple class uses a recursive approach to evaluate triangular numbers.
 * in other words, it finds the nth term in a series by adding n to the previous term.
 *
 * to get more insight about what is happening at each step, see {@link com.dsa.triangle.TriangleLoopVerbose}
 */
public class TriangleLoop {

    private static int userDefinedNumber;

    public static void main(String[] args) throws IOException {

        getUserInput();

        /** triangular equivalent to {@value#userDefinedNumber} */
        int triangle = triangulate(userDefinedNumber);

        System.out.println("Triangle = " + triangle);
    }

    /** prompts the user for a number to triangulate */
    public static void getUserInput() throws IOException, NumberFormatException {
        System.out.print("Enter a number: ");

        try {
            userDefinedNumber = getInt();
        } catch (IOException e) {
            System.out.println("Ooops, something went wrong.");
            e.printStackTrace();
        }
    }

    /** finds a number's triangular equivalent using recursion */
    public static int triangulate(int n) {

        // return if base-case
        if (n == 1) {
            return 1;
        } else {
            // otherwise, keep recursing
            return (n + triangulate(n - 1));
        }
    }

    /** creates stream needed to read from user input */
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    /** reads user input and converts to an int */
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
