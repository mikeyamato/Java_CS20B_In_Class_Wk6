package mine.ch04.queues;

import ch02.linkedlist.LLNode;

public class LinkedQueue<T> implements QueueInterface<T> {
    // based on a linked list
    protected LLNode<T> front;
    protected LLNode<T> rear;
    protected int size;  // size of queue

    public LinkedQueue(){
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void enqueue(T entry) {  // we can remove the 'throws' since we'll never use it
        // need to create a new node
        LLNode<T> newNode = new LLNode<T>(entry);
        if(rear == null)
            front = newNode;
        else
            rear.setLink(newNode);
        rear = newNode;
        size++;
    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        if(isEmpty())
            throw new QueueUnderflowException("blah");
        T element = front.getInfo();  // just care about the data inside the node
        front = front.getLink();
        if(front == null)
            rear = null;
        size--;
        return element;
    }

    @Override
    public boolean isFull() {
        // this will never be full
        return false;
    }

    @Override
    public boolean isEmpty() {
//        return front == null;  // this will work
        return size == 0;  // this should be okay
    }

    @Override
    public int size() {
        return 0;
    }
}
