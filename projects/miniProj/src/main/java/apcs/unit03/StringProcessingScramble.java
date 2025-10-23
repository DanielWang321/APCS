package apcs.unit03;

/*
The scrambling process should begin at the last letter of the word and continue from right to left
If two consecutive letters consist of an “E” followed by a letter that is not an “E”, then the two letters are swapped in the resulting String.
Once the letters in two adjacent positions have been swapped, neither of those two positions can be involved in a future swap.

 */
public class StringProcessingScramble {
    public static void main(String[] args) {
		System.out.println(scrambleWord("TEN"));
		System.out.println(scrambleWord("electric"));
		System.out.println(scrambleWord("seen"));
		System.out.println(scrambleWord(""));
		System.out.println(scrambleWord("ELEVEN"));
		System.out.println(scrambleWord("e"));
		System.out.println(scrambleWord("egg"));
		System.out.println(scrambleWord("fork"));

    }

    public static String normalize(String phrase) {
        // process the string (get rid of spaces and caps)
        String cleanedPhrase = "";
        for (int i = 0; i < phrase.length(); i++) {
            if ((phrase.charAt(i) != ' ') && (Character.isLetter(phrase.charAt(i)))) {
                cleanedPhrase += Character.toUpperCase(phrase.charAt(i));
            }
        }
        return cleanedPhrase;
    }

    public static String scrambleWord(String phrase) {
        phrase = normalize(phrase);
        for (int i = phrase.length() - 1; i > 0; i--) {
            if (phrase.charAt(i) == 'E' && phrase.charAt(i - 1) != 'E') {
                phrase = swap(phrase, i, i - 1);
            }
        }
        return phrase;
    }

    public static String swap(String phrase, int index1, int index2) {
        char char1 = phrase.charAt(index1);
        char char2 = phrase.charAt(index2);
        String newPhrase = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (i == index1) {
                newPhrase += char2;
            } else if (i == index2) {
                newPhrase += char1;
            } else {
                newPhrase += phrase.charAt(i);
            }
        }
        return newPhrase;
    }

}