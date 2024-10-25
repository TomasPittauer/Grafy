package day_15_10;

import java.util.LinkedList;

public class FIFOQueue<T> implements IQueue<T> {
    private LinkedList<T> data;


    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public T dequeue() {
        if (isEmpty()){return null;}
        return data.removeFirst();
    }

    @Override
    public void enqueue(T element) {
        data.addFirst(element);
    }
    public void clear(){
        data.clear();
    }
}
