package apcs.unit03;

public class StringProcessingAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("sheer", "here's")); // true
        System.out.println(isAnagram("hash", "sash")); // false
        System.out.println(isAnagram("DOOR", "odor")); // true
        System.out.println(isAnagram("door", "odor")); // true
        System.out.println(isAnagram("funeral", "real fun")); // true
        System.out.println(isAnagram("hi", "bye")); // false

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

    public static boolean isAnagram(String phrase1, String phrase2) {
        // check if letter in phrase 1 is in phrase 2
        // remove specific letter in phrase 2 if letter is in it
        phrase1 = normalize(phrase1);
        phrase2 = normalize(phrase2);
        int indexOfLetter;
        int i = 0;
        while (phrase1 != "") {
            indexOfLetter = phrase2.indexOf(phrase1.charAt(i));// index of the wanted letter while chekcing
            if (indexOfLetter != -1) {
                phrase2 = removeLetter(phrase2, indexOfLetter);
                phrase1 = phrase1.substring(1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static String removeLetter(String phrase, int index) {
        String newPhrase = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (i != index) {
                newPhrase += phrase.charAt(i);
            }

        }
        return newPhrase;
    }
}
