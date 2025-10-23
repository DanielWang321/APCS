package apcs.unit03;

public class miniExercise {
    public static void main(String[] args) {
        System.out.println(getReverse("hello"));
        System.out.println(printIndexes('l', "mississippi"));
    }

    public static String getReverse(String phrase) {
        String newPhrase = "";
        for (int i = phrase.length() - 1; i >= 0; i--) {
            newPhrase += phrase.charAt(i);
        }
        return newPhrase;
    }

    public static String printIndexes(char letter, String phrase) {
        String adder = "";
        String output;
        for (int i = 0; i < phrase.length(); i++) {
            if ((phrase.charAt(i))==(letter)) {
                adder += (i + " ");
            }
        }
        if (!adder.equals("")) {
            output = letter + " occurs in in " + phrase + " at index(es): " + adder;
            return output;
        } else {
            output = letter + " does not occur in " + phrase;
            return output;
        }
    }
}
/*
    public static void printIndexes2(char letter, String phrase) {
        String indexes = "";
        String newPhrase = phrase;
        int currentIndex = newPhrase.indexOf(letter);
        int addedIndex = 0;
        String cutOffPhrase;
        while (currentIndex == -1) {
            currentIndex = newPhrase.indexOf(letter);
            cutOffPhrase = newPhrase.substring(0, currentIndex);
            newPhrase = newPhrase.substring(currentIndex + 1);

            addedIndex += cutOffPhrase.length() - 1;
            
            indexes += addedIndex + " ";
        }
            
    }
}*/
