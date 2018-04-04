
package cz.cvut.fel.pjv;

/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {

    public int size;
    public int capacity;
    public int front;
    public int rear;
    public String[] array;



    /**
     * Creates the queue with capacity set to the value of 5.
     */
    public CircularArrayQueue() {
        this.capacity = 5;
        this.array = new String [5];
        this.front = 0;
        this.rear = 0;

    }


    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        this.capacity = capacity;
        this.array = new String[capacity];
        this.rear = rear;
        this.front = front;


    }

    @Override
    public int size() {


        return size;
    }

    @Override
    public boolean isEmpty() {
        if (array.length == 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean isFull() {
        if (this.size() == this.capacity )
            return true;
        else
            return false;
    }

    @Override
    public boolean enqueue(String obj) {
        if (this.isFull()){
            return false;
        }
        else{
            array[rear] = obj;
            size++;
            rear = (rear + 1) % size;

            return true;
        }
    }

    @Override
    public String dequeue() {
        if (this.isEmpty()) {
            return null;
        } else {
            String array2= array[front];
            size--;
            front = (front + 1) % capacity;
            return array2;
        }
    }

    @Override
    public void printAllElements() {
        for (String element: array){
            System.out.println(element);
        }
    }
}1