package apcs.unit03;

public class StringProcessingPalindrome1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mom")); // true
        System.out.println(isPalindrome("hi")); // false
        System.out.println(isPalindrome("Madam I'm Adam")); // true
        System.out.println(isPalindrome("Borrow or rob?")); // true
        System.out.println(isPalindrome("Was it a cat I saw??!")); // true
        System.out.println(isPalindrome("mommy")); // false
    }

    public static String normalize(String text) {
        String fixed = "";
        for (int i = 0; i < text.length(); i++) {
            char currentletter = text.charAt(i);
            if (Character.isLetter(currentletter) == true) {
                fixed = fixed + Character.toLowerCase(currentletter);
            }
        }
        return fixed;
    }

    public static boolean isPalindrome(String text) {
        text = normalize(text);
        boolean palindrome = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                palindrome = false;
            } else {
                // nothing
            }
        }
        return palindrome;
    }
}