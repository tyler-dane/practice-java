package java_basics.dsa.palindrome;

public class Main {
    public static void main(String[] args) {
        Palindrome pal = new Palindrome();
        //System.out.println(pal.isPalindromeStringBuilder("hannah"));
        //System.out.println(pal.isPalindromeReverseString("hannah"));

        String text = "anna";
        System.out.println(text.length());
        System.out.println(pal.isPalindromeRecursion(text, 0, text.length() -1));
    }
}
