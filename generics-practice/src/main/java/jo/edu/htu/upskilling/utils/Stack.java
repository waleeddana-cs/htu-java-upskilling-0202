package jo.edu.htu.upskilling.utils;


import java.util.ArrayList;
import java.util.Objects;

public class Stack<ELEMENT> {
    ArrayList<ELEMENT> stackList = new ArrayList<>();
    ELEMENT[] myStackList;
    int stackCapacity;
    int stackSize = 0;

    public Stack(int capacity) {

        if (capacity < 0) {
            throw new IllegalArgumentException("negative size");
        }
        myStackList = (ELEMENT[]) new Object[capacity];
        stackCapacity = capacity;
    }

    public int capacity() {

        return stackCapacity;
    }

    public int count() {
        return stackSize;
    }

    public ELEMENT pop() {

        if (stackSize == 0) {
            throw new IllegalStateException("stack is empty");
        }
        ELEMENT peak = myStackList[stackSize - 1];
        System.out.println(peak);
        myStackList[stackSize - 1] = null;
        stackSize -= 1;
        return peak;

    }

    public void push(ELEMENT element) {
        if (stackCapacity == stackSize) {
            throw new IllegalStateException("stack is full");
        }
        myStackList[stackSize] = element;
        stackSize += 1;
    }

    @Override
    public boolean equals(Object o) {
        Stack newStack = (Stack) o;
        if (newStack == null) {
            return false;
        }
        if (this.stackSize == newStack.stackSize) {
            for (int i = 0; i < this.stackSize; i++) {
                System.out.println("second "+newStack.myStackList[i]+" first stack :"+this.myStackList[i]);

                if (this.myStackList[i] == newStack.myStackList[i]) {
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
