package cap_01_31.reverse_polish_notation;

import java.util.Stack;

public class ReversePolishNotation {

    public static int evaluateRPN(String expression) {
        Stack<Integer> stack = new Stack<>();

        char[] tokens = expression.toCharArray();

        for (char token : tokens) {
            if (Character.isDigit(token)) {
                stack.push(token - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                int result = 0;

                switch (token) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "46+5*";

        System.out.println("Result: " + evaluateRPN(expression));

    }

}
