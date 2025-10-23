package apcs.unit03;

public class StringProcessingPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mom")); // true
        System.out.println(isPalindrome("hi")); // false
        System.out.println(isPalindrome("Madam I'm Adam")); // true
        System.out.println(isPalindrome("Borrow or rob?")); // true
        System.out.println(isPalindrome("Was it a cat I saw??!")); // true
        System.out.println(isPalindrome("mommy")); // false
    }

    public static String normalize(String phrase) {
        // process the string (get rid of spaces and caps)
        String cleanedPhrase = "";
        for (int i = 0; i < phrase.length(); i++) {
            if ((phrase.charAt(i) != ' ') && (Character.isLetter(phrase.charAt(i)))) {
                cleanedPhrase += Character.toLowerCase(phrase.charAt(i));
            }
        }
        return cleanedPhrase;
    }

    public static boolean isPalindrome(String phrase) {
        phrase = normalize(phrase);
        int i = 0;
        while (i < ((phrase.length()) / 2)) {
            if (phrase.charAt(i) != phrase.charAt(phrase.length() - 1 - i)) {
                return false;
            }
            i++;
        }
        return true;
    }

}
