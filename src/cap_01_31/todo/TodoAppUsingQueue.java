package cap_01_31.todo;

import java.util.Scanner;

class MyQueue {
    private String[] queue;
    private int front, rear, size;

    public MyQueue(int size) {
        this.size = size;
        front = 0;
        rear = -1;
        queue = new String[size];
    }

    void enqueue(String item) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = item;
    }

    String dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return "";
        }

        return queue[front++];
    }

    String peek() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        }

        return queue[front];
    }

    @Override
    public String toString() {
        if (front > rear) {
            return "No tasks available.";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = front; i <= rear; i++) {
            sb.append(i - front + 1)
                    .append(". ")
                    .append(queue[i])
                    .append("\n");
        }
        return sb.toString();
    }
}

public class TodoAppUsingQueue {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        MyQueue todos = new MyQueue(10);

        while (true) {
            System.out.println("---- TO DO APP ----");
            System.out.println("1. Add Task");
            System.out.println("2. View Next Task");
            System.out.println("3. Complete Task");
            System.out.println("4. View All Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Program....");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Task: ");
                    String task = sc.nextLine();
                    todos.enqueue(task);
                    break;

                case 2:
                    System.out.println(todos.peek());
                    break;

                case 3:
                    System.out.println(todos.dequeue());
                    break;

                case 4:
                    System.out.println(todos);
                    break;
                default:
                    break;

            }
        }
    }
}
