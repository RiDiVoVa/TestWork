package ua.com.It.Source.Task2;

import java.util.HashMap;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubTask1 {
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
