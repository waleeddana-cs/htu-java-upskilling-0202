package jo.edu.htu.upskilling.utils;

import java.util.ArrayList;
import java.util.Objects;

public class Stack<ELEMENT> {
    ArrayList<ELEMENT> stackList = new ArrayList<>();
    int stackCapacity;

    public Stack(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("negative size");
        }
        stackList.ensureCapacity(capacity);
        stackCapacity = capacity;
    }

    public int capacity() {
        return stackCapacity;
    }

    public int count() {
        return stackList.size();
    }

    public ELEMENT pop() {
        if (stackList.size() == 0) {
            throw new IllegalStateException("stack is empty");
        }


        ELEMENT peak = stackList.remove(stackList.size() - 1);
        return peak;

    }

    public void push(ELEMENT element) {
        if (stackCapacity == (stackList.size())) {
            throw new IllegalStateException("stack is full");
        }
        stackList.add(element);
    }

    @Override
    public boolean equals(Object o) {
        Stack newStack = (Stack) o;
        if (newStack == null) {
            return false;
        }

        System.out.println( (this.stackList.size() == newStack.stackList.size()));

        if (this.stackList.size() == newStack.stackList.size()) {
            for (int i = 0; i < stackList.size(); i++) {
                if (stackList.get(i) == newStack.stackList.get(i)) {
                    continue;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackList);
    }
}
