package jo.edu.htu.upskilling.utils;


public class Stack<ELEMENT> {
    private int cap;
    int count;
    int x = 0;
    ELEMENT array[] ;


    public Stack(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("negative size");
        this.cap = capacity;
    }

    public int capacity() {

        return array.length ;
    }

    public int count() {
        return -1;
    }

    public ELEMENT pop() {
        if (cap == 0)
            throw new IllegalStateException("stack is empty");
        return (ELEMENT) array;
    }

    public void push(ELEMENT element) {
        if (cap == array.length)
            throw new IllegalStateException("stack is full");
        array[x] = element;
        count += 1;
        x += 1;

    }
}
