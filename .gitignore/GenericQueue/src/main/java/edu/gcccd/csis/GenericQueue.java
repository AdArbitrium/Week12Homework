package edu.gcccd.csis;
import java.util.ArrayList;


public class GenericQueue<E> {

    private final ArrayList<E> elements;
    final int capacity;

    public GenericQueue() {
        this(10);
    }

    public GenericQueue(int capacity)
    {
        capacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    //remove from front
    public E dequeue() {
        if (elements.size() == 0){
            return null;
        }
        return elements.remove(0);
    }

    //add to the back
    public void enqueue(E queValue) {
        if (elements.size() == capacity){
            return;
        }
        if (queValue == null){
            return;
        }
        elements.add(queValue);
    }

    // current length of the queue
    public int length() {
        return elements.size();
    }

}