package day_15_10;

public interface IQueue<T> {

    public boolean isEmpty();
    public T dequeue();
    public void enqueue(T element);
}
