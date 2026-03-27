package apcs.unit09;

import java.util.Stack;

public class ReversibleStack<E> extends Stack<E> {

    public ReversibleStack() {
        super();
    }

    public void reverse() {
        Stack<E> tempStack = (Stack<E>) this.clone();

        while (this.size() > 0) {
            this.pop();
        }

        while (tempStack.size() > 0) {
            this.push((E) tempStack.pop());
        }
    }
}
