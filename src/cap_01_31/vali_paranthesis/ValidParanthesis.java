package cap_01_31.vali_paranthesis;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String str = "{[(()]}";

        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }
                char top = stack.pop();
                if ((ch == ']' && top != '[') || (ch == '}' && top != '{') || (ch == ')' && top != '(')) {
                    System.out.println("Invalid");

                    return;
                }
            }
        }

        System.out.println("Valid");

    }

}

