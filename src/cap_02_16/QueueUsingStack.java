package cap_02_16;

import java.util.*;

public class QueueUsingStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public void pushElement(int x) {
        stack1.push(x);
    }

    public int popElement() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peekElement() {
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean isEmptyResult() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            QueueUsingStack queue = new QueueUsingStack();
            int operations = sc.nextInt();
            sc.nextLine();

            while(operations-->0){
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                String operation = parts[0];

                if (operation.equals("push")){
                    int value = Integer.parseInt(operation.split(" ")[1]);
                    queue.pushElement(value);
                }else if(operation.equals("peek")){
                    System.out.println(queue.popElement());
                } else if(operation.equals("pop")){
                    System.out.println(queue.peekElement());
                } else if(operation.equals("empty")){
                    System.out.println(queue.isEmptyResult());
                }
            }
        }

        sc.close();
     }
}
