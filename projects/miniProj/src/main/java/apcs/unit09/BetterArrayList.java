package apcs.unit09;

import java.util.ArrayList;

public class BetterArrayList<E extends Comparable<E>> extends ArrayList<E> {
    // ideas:
    // remove duplicates from an ArrayList (boolean)
    // number of occurances
    // get indexes of

    public BetterArrayList() {
        super();
    }

    // returns the number of times that the element occurs in THIS list
    public int getNumberOfOccurances(E element) {
        int count = 0;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).equals(element)) {
                count++;
            }
        }
        return count;
    }

    // returns the number of elements removed from THIS list
    // if keepFirst is true, all duplicate elements will be removed except for first
    // occurance of element
    // else: all duplicate elements will be removed except for last occurance of the
    // element

    public int removeDuplicates(boolean keepFirst) {
        int initialSize = this.size();
        if (keepFirst) {
            for (int i = this.size() - 1; i >= 0; i--) {
                // if current element occurs more than once
                // remove element
                if (this.getNumberOfOccurances(this.get(i)) > 1) {
                    this.remove(i);
                }
            }
        } else {
            for (int i = 0; i >= this.size(); i++) {
                // if current element occurs more than once
                // remove element
                if (this.getNumberOfOccurances(this.get(i)) > 1) {
                    this.remove(i);
                    i -= 1;
                }
            }
        }
        return initialSize - this.size();
    }

    // post: this is unchanged
    public boolean isSorted(boolean ascending) {
        if (ascending) {
            for (int i = 0; i < this.size() - 1; i++) {
                if (this.get(i).compareTo(this.get(i + 1)) >= 0) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < this.size() - 1; i++) {
                if (this.get(i).compareTo(this.get(i + 1)) <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BetterArrayList<String> words = new BetterArrayList<>();

    }

}