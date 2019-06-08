package java_basics.recursion.anagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * todo:
 * - comment dis
 * - check words against an english dictionary
 * - add error handling if not dictionary word
 */
public class Anagram {

    /** size of the word */
    static int size;

    /** count of the number of recursions */
    static int count;

    /** array to hold the size of the word. limited to 100 characters */
    static char[] arrChar = new char[100];

    /** list of all letter permutations for a given word. this is evaluated against an english dictionary in order
     * to filter out non-words. */
    static ArrayList<String> letterCombinations = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        // get word
        System.out.print("Enter a word: ");

        String word = getString();

        //letterCombinations.add(word);

        System.out.println(letterCombinations);

        size = word.length();

        count = 0;

        // put word into our char array
        for (int j = 0; j < size; j++) {
            arrChar[j] = word.charAt(j);
        }

        //call anagram method, providing the size of the word
        doAnagram(size);
    }

    /** anagrams the word */
    public static void doAnagram(int newSize) throws IOException {
        // exit if word too small
        if ( newSize == 1 ) {
            return;
        }

        // anagram remaining characters
        for (int j = 0; j < newSize; j++) {
            doAnagram(newSize - 1);

            // base case: display word if innermost character
            if (newSize == 2) {
                displayWord();
            }

            // rotate word
            rotate(newSize);
        }
    }

    /** rotates characters from right to left one-by-one. by doing this for each character,
     * we can be sure to find each anagram. */
    public static void rotate(int newSize) {

        int j;

        int position = size - newSize;

        // temporarily saves first letter in an array
        char temp = arrChar[position];

        // shifts all other letters left
        for (j = position + 1; j < size; j++){
            arrChar[j - 1] = arrChar[j];
        }

        // after shifting other letters left, we can move first letter to the end
        arrChar[j - 1] = temp;
    }

    /** prints each anagram in a pretty format */
    public static void displayWord() throws IOException {

        // dictionary that is used to check if permutation is an english word
        EnglishDictionary dictionary = new EnglishDictionary();

        // makes sure single-digit counts don't skew prettiness of output
        if(count < 99) {
            System.out.print(" ");
        }

        if(count < 9) {
            System.out.print(" ");
        }

        // increment and print count
        System.out.print(++count + " ");

        // print each permutation
        for (int j = 0; j < size; j++) {
            System.out.print(arrChar[j]);
        }

        // adds spacing for readability
        System.out.print("   ");
        System.out.flush();

        // prints five permutations per row
        if ( count % 5 == 0) {
            System.out.println("");
        }
    }

    /** creates stream needed to read from user input */
    public static String getString() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine();

        return s;
    }
}
