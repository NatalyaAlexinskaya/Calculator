package com.company;

import java.util.Stack;

public class ParsingString {
    public static String pars(String text) {
        StringBuilder current = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int value;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                continue;
            }
            value = getVal(text.charAt(i));

            if (value == 0) {
                current.append(text.charAt(i));
            } else if (value == 1) {
                stack.push(text.charAt(i));
            } else if (value > 1) {
                current.append(" ");
                while (!stack.empty()) {
                    if (getVal(stack.peek()) >= value) {
                        current.append(stack.pop());
                    } else {
                        break;
                    }
                }
                stack.push(text.charAt(i));
            } else if (value == -1) {
                current.append(" ");
                while (getVal(stack.peek()) != 1) {
                    current.append(stack.pop());
                }
                stack.pop();
            }
        }
        while (!stack.empty()) {
            current.append(stack.pop());
        }
        return current.toString();
    }

    public static int getVal(char token) {
        if (token == '*' || token == '/') {
            return 3;
        } else if (token == '+' || token == '-') {
            return 2;
        } else if (token == '(') {
            return 1;
        } else if (token == ')') {
            return -1;
        } else return 0;
    }
}
