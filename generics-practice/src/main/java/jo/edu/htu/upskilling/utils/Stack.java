package jo.edu.htu.upskilling.utils;
import java.util.Iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Stack<ELEMENT> implements Iterable<ELEMENT> {
    Object[] array;
    int pointer;

    public Stack(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("negative size");
        array = new Object[capacity];

    }

    public int capacity() {
        return array.length;
    }

    public int count() {
        return pointer;
    }

    public ELEMENT pop() {
        if (array.length == 0 | array.length == 0)
            throw new IllegalStateException("stack is empty");
        if (pointer == 0)
            throw new IllegalStateException("stack is empty");
        pointer--;
        return (ELEMENT) array[pointer];
    }

    public void push(ELEMENT element) {
        if (pointer == array.length)
            throw new IllegalStateException("stack is full");
        array[pointer] = element;
        pointer++;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stack<ELEMENT> stack = (Stack<ELEMENT>) o;
        return pointer == stack.pointer &&
                isEqual(array, stack.array);
    }

    private boolean isEqual(Object[] element1, Object[] element2) {
        for (int i = 0; i < pointer; i++) {
            if (element1[i] != element2[i])
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(array[pointer]);
    }

    @Override
    public Iterator<ELEMENT> iterator() {
        return null;
    }
}
