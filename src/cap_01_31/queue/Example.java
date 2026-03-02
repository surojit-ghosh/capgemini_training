package cap_01_31.queue;

import java.util.Arrays;

class CustomQueue {
    private int[] queue;
    private int front, rear, size;

    public CustomQueue(int size) {
        this.size = size;
        front = 0;
        rear = -1;
        queue = new int[size];
    }

    void enqueue(int item) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = item;
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        front++;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(queue, front, rear + 1));
    }

}

public class Example {

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue);

        queue.dequeue();

        System.out.println(queue);
    }

}

