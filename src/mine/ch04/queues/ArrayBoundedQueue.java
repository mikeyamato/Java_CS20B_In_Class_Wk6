package mine.ch04.queues;

public class ArrayBoundedQueue<T> implements QueueInterface<T> {

    // since bounded, create a limit
    protected final int CAP = 100; // CAP = capacity
    protected T[] elements;
    protected int size = 0;
    protected int front = 0;
    protected int rear ;  // we don't know what the value of rear yet so don't associate it with a value yet

    // create a constructor
    public ArrayBoundedQueue(){
        elements = (T[]) new Object[CAP];
        rear = CAP - 1;
    }

    @Override
    public void enqueue(T entry) throws QueueOverflowException {
        if(isFull()){
            throw new QueueOverflowException("The queue is full");
        }
        // rear = (rear + 1) % elements.length // this can be a bit confusing. this resets or increments
        if(rear == elements.length -1){
            rear = 0;  // reset to the beginning of the queue
        }
        else {
            rear++;
        }
        elements[rear] = entry;   // adding element to rear
        size++;
    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException("The queue is empty");
        }
        else {
            T returnElem = elements[front];
            elements[front] = null;
            front = (front + 1) % elements.length;
            size--;
            return returnElem;
        }
    }

    @Override
    public boolean isFull() {
        return rear == (elements.length - 1);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
