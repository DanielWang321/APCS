package apcs.unit07;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/*
 * Example 1: write a method that fills an ArrayList from
 * data in a file
 * Example 2: print the elements in an ArrayList, one per line
 * Example 3: write a method with the following pre and post conditions and
 * header:
 * Precondition: ArrayList list contains Integer values sorted in increasing
 * order
 * Postcondition: value inserted in its correct position in list
 * public static void insert(ArrayList<Integer> list, Integer value)
 * Example 4: write a method that returns an ArrayList (of random size from
 * 1-100) of random integers from -50 to 50
 * Example 5: write a method that swaps two values in list, indexed at i and j
 * Example 6: write a method that prints all negatives in list a
 * (assume that list contains Integer values)
 * Example 7: write a method that changes every even-indexed element of
 * strList to the empty String (assume that strList contains String values)
 * Example 8: write a method that removes all elements from an ArrayList
 * of type String that have the value of "and", "the", "a", "or", "an", "is",
 * "are"
 */
public class ArrayListNotes {
    public static void main(String[] args) throws FileNotFoundException {
        // types of declarations
        ArrayList anything = new ArrayList(); // type Object
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer> nums = new ArrayList<>();

        /*
         * ArrayList Functions
         * int size()
         * boolean add(E obj) -adds to end of list. Boolean because it can fail
         * void add(int index, E obj) -inserts obj at index
         * E get(int index) -returns element at index
         * E set(int index, E obj) -replaces element at index with obj
         * E remove(int index) -removes and returns element at index
         */

        // tracing example 1
        words.add("apple");
        words.add("orange");
        words.add(1, "banana");
        words.remove(2);
        words.add(0, "pomegranate");
        words.set(1, "mango");
        // pomegranate, mango, banana

        // tracing example 2
        nums.add(6); //
        nums.add(100);
        nums.add(42);
        nums.add(2, 3);
        nums.remove(1);
        nums.set(1, -4);
        nums.add(0, 4);
        nums.set(nums.size() - 1, 7);
        nums.add(nums.size() - 1, 0);
        nums.add(nums.size(), 9);

        // 4, 6,-4,0,7,9

        // potential OOB errors
        // nums.add(nums.size() + 1, 0);
        // nums.set(nums.size(), 9);

        // nums.remove(nums.size())
        // we can add elements to indexes [0, nums.size()]
        // we can remove, get, and set elements to indexes [0, nums.size() - 1]
        ArrayList<String> wordList = getWordList("projects\\miniProj\\data\\words.txt");
        System.out.println(wordList);
        ArrayList<String> numList = getWordList("projects\\miniProj\\data\\nums.txt");
        System.out.println(numList);

    }

    public static ArrayList<String> getWordList(String fileName) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner fScan = new Scanner(new File(fileName));
        while (fScan.hasNext()) { // while there is stuff in the file
            list.add(fScan.next());
        }
        return list;
    }

    public static ArrayList<Integer> getNumList(String fileName) throws FileNotFoundException {
        Scanner fScan = new Scanner(new File(fileName));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (fScan.hasNextInt()) {
            nums.add(fScan.nextInt());
        }
        return nums;
    }

    public static <E> void printOnePerLine(ArrayList<E> list) {
        for (E temp : list) {
            System.out.println(temp);
        }
    }

    // Example 4: write a method that returns an ArrayList (of random size from
    // 1-100) of random integers from -50 to 50
    public static ArrayList<Integer> getRandomNumberList() {
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        for (int i = 0; i < (int) (Math.random() * 100) + 1; i++) {
            randomArray.add((int) (Math.random() * 101) - 50);
        }
        return randomArray;
    }

    /*
     * Example 3: write a method with the following pre and post conditions and
     * header:
     * Precondition: ArrayList list is sorted in increasing order
     * Postcondition: value inserted in its correct position in list
     * public static void insert(ArrayList<Integer> list, Integer value)
     */
    public static <E extends Comparable<E>> void insert(ArrayList<E> list, E value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(value) > 0) {
                list.add(i, value);
                return;
            }
        }
        // value larger than all list elements
        list.add(value);
    }

    // pre: i and j are [0,list.size()]
    // post: list elements at indexes i and j have been swapped
    public static <E> void swap(ArrayList<E> list, int i, int j) {
        E temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    // post: list is unchanged
    // returns a list containing all negative elements
    public static ArrayList<Integer> getNegative(ArrayList<Integer> list) {
        ArrayList<Integer> editedArr = new ArrayList<Integer>();
        for (int integer : list) {
            if (integer < 0) {
                editedArr.add(integer);
            }
        }
        return editedArr;
    }
    //post: words do not contain any of the following: and, the, a, or, an, is, are
    public static void removeSmallWords(ArrayList<String> words){
        for(int i = words.size()-1; i>0; i--){
            if (isSmallWord(words.get(i))){
                words.remove(i);
            }
        }
    }
    //returns true if word is any of the following: and, the, a, or, an, is, are
    public static boolean isSmallWord(String word){
        word = word.toLowerCase();
        String[] badWords = new String[]{"and", "the", "a", "or", "an", "is", "are"};
        for (String badword : badWords) {
            if (word.equals(badword)){
                return true;
            }
        }
        return false;
    }
}
