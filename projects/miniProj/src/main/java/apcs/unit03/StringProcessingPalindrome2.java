package apcs.unit03;

public class StringProcessingPalindrome2
{
    public static void main(String[] args) {

        System.out.println(isPalindrome("mom")); // true
        System.out.println(isPalindrome("hi")); // false
        System.out.println(isPalindrome("Madam I'm Adam")); // true
        System.out.println(isPalindrome("Borrow or rob?")); // true
        System.out.println(isPalindrome("Was it a cat I saw??!")); // true
        System.out.println(isPalindrome("mommy")); // false

    }

    public static String normalize(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char currentLetter = input.charAt(i);
            if (Character.isLetter(currentLetter)) {
                result += Character.toLowerCase(currentLetter);
            }
        }

        return result;
    }

    public static boolean isPalindrome(String text) {
        text = normalize(text);
        for (int i = 0; i < (text.length() / 2); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
