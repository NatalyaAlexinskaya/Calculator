package com.company;

import java.util.Stack;

public class Answer {
    public static double toAnswer(String text) {
        StringBuilder operand = new StringBuilder();
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            if (ParsingString.getVal(text.charAt(i)) == 0) {
                while (text.charAt(i) != ' ' && ParsingString.getVal(text.charAt(i)) == 0) {
                    operand.append(text.charAt(i++));
                    if (i == text.length()) {
                        break;
                    }
                }
                stack.push(Double.parseDouble(operand.toString()));
                operand = new StringBuilder();
            }

            if (ParsingString.getVal(text.charAt(i)) > 1) {
                double a = stack.pop();
                double b = stack.pop();

                switch (text.charAt(i)) {
                    case '+':
                        stack.push(b + a);
                        break;
                    case '-':
                        stack.push(b - a);
                        break;
                    case '*':
                        stack.push(b * a);
                        break;
                    case '/':
                        stack.push(b / a);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
