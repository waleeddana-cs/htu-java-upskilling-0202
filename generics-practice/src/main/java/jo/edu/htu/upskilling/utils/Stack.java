package jo.edu.htu.upskilling.utils;

import java.util.Iterator;
import java.util.Objects;

public class Stack<ELEMENT> implements Iterable<ELEMENT>  {

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
        if (array.length == 0)
            throw new IllegalStateException("stack is empty");

        if (pointer == 0)
            throw new IllegalStateException("stack is empty");
        pointer--;
        return (ELEMENT) array[pointer];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stack<?> stack = (Stack<?>) o;
        return pointer == stack.pointer &&
                checkEqual(array, stack.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pointer);
        result = 31 * result + hashCode(array);
        return result;
    }

    public void push(ELEMENT element) {
        if (pointer == array.length)
            throw new IllegalStateException("stack is full");
        array[pointer] = element;
        pointer++;
    }

    private boolean checkEqual(Object[] element1, Object[] element2) {
        for (int i = 0; i < pointer; i++) {
            if (!element1[i].equals(element2[i]))
                return false;
        }
        return true;
    }

    private int hashCode(Object[] var0) {
        if (var0 == null) {
            return 0;
        } else {
            int var1 = 1;
            int var3 = pointer;

            for (int var4 = 0; var4 < var3; ++var4) {
                Object var5 = var0[var4];
                var1 = 31 * var1 + (var5 == null ? 0 : var5.hashCode());
            }

            return var1;
        }
    }

    @Override
    public Iterator<ELEMENT> iterator() {
        return null;
    }
}
