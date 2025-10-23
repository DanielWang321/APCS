package apcs.unit03;

public class Notes_3_4 {
    // driver : a special type of function/class that has the primary purpose of
    // testing other
    // functions/classes
    public static void main(String[] args) {
        System.out.println(vowelRemove("aeuiousasd"));
    }

    // precondition: name contains exactly one space
    // returns a String with the first and last initials of name
    public static String makeInitials(String name) {
        String fInitial = name.substring(0, 1);
        int spaceIndex = name.indexOf(" ");
        String lInitial = name.substring(spaceIndex + 1, spaceIndex + 2);

        return fInitial + "." + lInitial + ".";
    }

    // returns a string with initials of name where initials are defined by the
    // first
    // nonwhite space character of name, and any non white space
    // characters that follow whitespace throught the String
    public static String makeBetterInitials(String name) {
        name = name.trim();// this assigns name to itsself, getting rid of leading and trailing whitespace
        if (name.length() == 0) {
            return "";
        }
        // assertion: first character of name is first initial
        String initials = name.substring(0, 1) + ".";
        // while there are spaces in name

        while (name.indexOf(" ") != -1) {
            int spaceIndex = name.indexOf(" ");
            name = name.substring(spaceIndex + 1).trim();

            initials += name.substring(0, 1) + ".";

        }
        return initials;
    }

    public static String makeBetterInitials2(String name) {
        name = name.trim();// this assigns name to itsself, getting rid of leading and trailing whitespace
        if (name.length() == 0) {
            return "";
        }
        // assertion: first character of name is first initial
        String initials = name.substring(0, 1) + ".";

        // for each character in name, if the character is a psace,
        // if the next character is not a space, add next character to initials

        for (int i = 0; i < name.length() - 1; i++) {
            if (name.charAt(i) == ' ' && name.charAt(i + 1) != ' ') {
                initials += name.charAt(i + 1) + ".";
            }
        }
        return (initials);
    }

    // return true if letter is vowel
    public static boolean isVowel(char currentLetter) {
        currentLetter = Character.toLowerCase(currentLetter);
        return currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'i' || currentLetter == 'o'
                || currentLetter == 'u';
    }

    // returns phrase but with no vowels
    public static String vowelRemove(String phrase) {
        String newPhrase = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (isVowel(phrase.charAt(i)) == false) {
                newPhrase = newPhrase + phrase.charAt(i);
            }
        }
        return newPhrase;
    }
    
}

// braces define the function body
// public - access modifier - accessible outside of this class
// static (as opposed to instance) - class function
// not meant to be invoked on an instance of an object
// return type
// parameter list (what a function needs to do its job)

// precondition: what should be true before a function executes
// in order for it to execute properly
// postcondition: what should be true after a function executes
/*
 * 1. Write a function with the following header and precondition:
 * //precondition: name contains exactly one space
 * //returns a String with the first and last initials of name
 * public static String makeInitials(String name)
 * 
 * 2. Write a function that accepts a String that represents a name.
 * The function should return the initials of the name.
 * The function should work whether the String represents a first and last name,
 * or first, middle, and last name.
 * 
 * 3. Write a function that returns a String that is equivalent to its String
 * parameter,
 * but with all characters that are alphabetical vowels removed
 * 
 * 
 */
