package jo.edu.htu.upskilling.utils;

import java.util.Iterator;


import java.util.Arrays;
import java.util.Objects;
public class Stack<ELEMENT> implements Iterable<ELEMENT>  {
        private int capacity;
    private ELEMENT[] arr;
    private int counter = 0;

    public Stack(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("negative size");
        this.capacity = capacity;
        arr = (ELEMENT[]) new Object[capacity];
    }

    public int capacity() {
        return capacity;
    }

    public int count() {
        return counter;
    }

    public ELEMENT pop() {
        if (counter == 0)
            throw new IllegalStateException("stack is empty");
        return arr[--counter];
    }

    public void push(ELEMENT element) {
        if (counter >= capacity)
            throw new IllegalStateException("stack is full");
        arr[counter++] = element;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stack<?> stack = (Stack<?>) o;
        if (counter != stack.counter) return false;
        for (int i = 0; i < counter; i++)
            if (arr[i] != stack.arr[i]) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return 31 * counter + 37;
    }

    @Override
    public Iterator<ELEMENT> iterator() {
        return null;
    }
}
