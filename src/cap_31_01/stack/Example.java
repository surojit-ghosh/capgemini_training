package cap_31_01.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class StackCustom {
    int[] stack;
    int top;
    int size;

    StackCustom(int size) {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    public void push(int item) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void grow() {
        stack = Arrays.copyOf(stack, size * 2);
        size *= 2;
    }

//	public void grow() {
//		int newSize = size * 2;
//
//		int[] newStack = new int[newSize];
//
//		for (int i = 0; i <= top; i++) {
//			newStack[i] = stack[i];
//		}
//
//		stack = newStack;
//		size = newSize;
//	}

    public int size() {
        return top + 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(stack, 0, top + 1));
    }
}

public class Example {

    public static void main(String[] args) {
//		Stack stack = new Stack(); // using collections framework

        StackCustom stack = new StackCustom(10); // using custom implementation

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
//		System.out.println("Position of 20 from top: " + stack.search(20));
//
        stack.pop();
//
        System.out.println(stack);
//
//		stack.clear();
//		System.out.println(stack);
    }

}

