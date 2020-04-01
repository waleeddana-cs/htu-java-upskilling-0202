package jo.edu.htu.upskilling.utils;

import java.util.Iterator;

public class Stack<ELEMENT> implements Iterable<ELEMENT> {
    private ELEMENT stackArr[];
    private int intSize = 0;

    public Stack(int capacity) {
        if (capacity >= 0)
            stackArr = new ELEMENT[capacity];
    }

    public int capacity() {
        return stackArr.length;
    }

    public int count() {
        return intSize;
    }

    public ELEMENT pop() {
        if (intSize > 0)
            return stackArr[intSize--];
        else
            return -1;
    }


    public void push(ELEMENT element) {
        if (intSize < stackArr.length) {
            stackArr[++intSize] = element;
        }
    }

    public boolean equals(Stack stack) {
        if (stack != null)
            if (this.intSize == stack.intSize) {
                for (int i = 0; i < this.stackArr.length; i++) {
                    if (this.stackArr[i] != stack.stackArr[i]) {
                        return false;
                    }
                }
                return true;
            } else
                return false;
        else
            return false;
    }


    @Override
    public Iterator<ELEMENT> iterator() {
        return null;
    }
}
