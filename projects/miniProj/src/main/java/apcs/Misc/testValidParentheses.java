package apcs.Misc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testValidParentheses {

    static Map<Character, Character> openCloseMap = new HashMap<>();

    static {
        openCloseMap.put('(', ')');
        openCloseMap.put('[', ']');
        openCloseMap.put('{', '}');
    }

    public static void main(String[] args) {
        String s = "()()([]{}[])";
        boolean valid = isValid(s);
        System.out.println("The string " + s + " is valid: " + valid);

    }

    public static boolean isValid(String s) {
        System.out.println("validating string " + s);
        if (s.length() % 2 != 0 || s.isEmpty()) {
            return false;
        }
        if (!isOpenChar(s)) {
            return false; 
        }
        //char charToMatch = s.charAt(0);
        int closingIndex = findClosingIndexForFirstChar(s);
        if (closingIndex == 1) {
            // the first one is closing, continue to find the rest string 
            System.out.println("found matching closing at " + closingIndex);
            String remainingStr = s.substring(2);
            System.out.println("remainingStr is " + remainingStr);
            if (remainingStr.length() > 0) {
                return isValid(remainingStr);
            }
            return true;
        } else if (closingIndex < 1) {
            System.out.println("couldn't find matching closing");
            return false;
        } else if (closingIndex > 1) {
            System.out.println("found matching closing at " + closingIndex);
            String remainingStr = s.substring(closingIndex + 1 );
            System.out.println("remainingStr is " + remainingStr);
            boolean isRemainingValid = isValid(remainingStr);
            String innerString = s.substring(1, closingIndex);
            System.out.println("innerString is " + innerString );
            boolean isInnerStringValid = isValid(innerString);
            return isRemainingValid && isInnerStringValid;
        }

        return false;
    }

    // find the index of the matching character, index start wti
    public static int findClosingIndexForFirstChar(String s) {
        char firstChar = s.charAt(0);
        String subStringToFind = s.substring(1);
        System.out.println("find closing for " + firstChar + " in " + subStringToFind);
        int index = 0;
        int openCounter = 0;
        for (char cInS : subStringToFind.toCharArray()) {
            if (cInS == firstChar) {
                System.out.println("found open char add counter");
                openCounter++;
            } else if (cInS == openCloseMap.get(firstChar)) {
                if (openCounter == 0) {
                    System.out.println("found closing ");
                    return index +1;
                }
                System.out.println("found closing char sbstract counter");
                openCounter--;
            }
            index++;
        }
        return -1;
    }

    public static boolean isOpenChar(String input) {
        List<String> openings = List.of("{", "[", "(");
        boolean startsWithAny = false;
        for (String openChar : openings) {
            if (input.startsWith(openChar)) {
                startsWithAny = true;
                break;
            }
        }
        return startsWithAny;
    }
}
