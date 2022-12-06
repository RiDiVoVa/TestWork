

import java.util.Stack;

public class SubTask1ForTask2 {
    public static boolean testString(String text) {
        if (text == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == '(' || symbol == '{' || symbol == '[')
                stack.push(symbol);
            else if (symbol == ']') {
                if (stack.empty() || stack.pop() != '[')
                    return false;
            } else if (symbol == '}') {
                if (stack.empty() || stack.pop() != '{')
                    return false;
            } else if (symbol == ')') {
                if (stack.empty() || stack.pop() != '(')
                    return false;
            }
        }
        return stack.empty();
    }

}
