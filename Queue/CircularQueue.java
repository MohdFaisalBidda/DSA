package Queue;

public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;

    protected int start = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[start++];
        start = start % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[start];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("EMPTY");
        }
        int i = start;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
    System.out.println("END");
    }
}
