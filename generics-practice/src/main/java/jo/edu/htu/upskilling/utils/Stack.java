package jo.edu.htu.upskilling.utils;

public class Stack<ELEMENT> {

    private int capacity;
    private ELEMENT[] arr;
//    = new <ELEMENT>[capacity];

    public Stack(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("negative size");
        this.capacity = capacity;
        if (capacity == 0)
            pop();
//            throw new IllegalStateException("stack is empty");

//        arr = new <ELEMENT>[capacity];
    }

    public int capacity() {
        return capacity;
    }

    public int count() {
        return -1;
    }

    public ELEMENT pop() {
        if (capacity == 0)
            throw new IllegalStateException("stack is empty");
        return null;
    }

    public void push(ELEMENT element) {


    }
}
