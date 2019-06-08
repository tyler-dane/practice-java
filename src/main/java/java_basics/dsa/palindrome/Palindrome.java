package java_basics.dsa.palindrome;

public class Palindrome {
    public boolean isPalindromeStringBuilder(String text) {
        String clean = text.replaceAll("\\s+","").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString().equals(clean));
    }
    public boolean isPalindromeReverseString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+","").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString().equals(clean));
    }
    public boolean isPalindromeRecursion(String text, int forward, int backward) {
        // if at the middle index
        if (forward == backward) {
            return true;
        }

        // each forward index needs to match the back
        // e.g. hAnnAh (index 1 == index 4)
        if ((text.charAt(forward) != text.charAt(backward))) {
            return false;
        }

        // forward should start at 0 and work towards middle
        if (forward < backward + 1) {
            System.out.println("forward: " + text.charAt(forward));
            System.out.println("backward: " + text.charAt(backward));
            return isPalindromeRecursion(text, forward + 1, backward - 1);
        }

        return true;
    }
}
