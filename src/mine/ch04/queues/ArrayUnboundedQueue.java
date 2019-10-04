package mine.ch04.queues;

public class ArrayUnboundedQueue<T> implements QueueInterface<T> {

    public ArrayUnboundedQueue(){

    }

    @Override
    public void enqueue(T entry) throws QueueOverflowException {

    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        return null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
