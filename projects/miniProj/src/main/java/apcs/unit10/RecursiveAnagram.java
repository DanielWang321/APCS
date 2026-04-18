package apcs.unit10;

public class OneDProblem {
    public static void main(String[] args) {

        System.out.println("anagram 4: " + isAnagram("tooth", "hooth"));

    }

    public static boolean isAnagram(String word1, String word2) {
        // word1 = word1.substring(0,word1.indexOf(" "))
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        if (word1.length() != word2.length())
            return false;
        if (word1.length() <= 0) {
            System.out.println("length is 0");
            return true;
        }
        int ind = word1.indexOf(word2.substring(0, 1));
        System.out.println(ind);

        if (ind >= 0) {

            //deletes characters
            word1 = word1.substring(0, ind) + word1.substring(ind + 1);
            System.out.println(word1);
            word2 = word2.substring(1);
            System.out.println(word2);

            isAnagram(word1, word2);
        } else
            return false;

        return true;

    }
}
