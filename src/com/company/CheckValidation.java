package com.company;

import com.Exception.WrongCharacterException;

public class CheckValidation {
    public static void check(String text) throws WrongCharacterException, ArithmeticException {
        if (!text.matches("(?:\\s*\\d+(.\\d+)?\\s*[*+/-]\\s*)+\\d+(.\\d+)?")) {
            throw new WrongCharacterException("Вводите только цифры и знаки математических операций(+-*/), без скобок и отрицательных чисел!");
        } else if (text.contains("/0") || text.contains("/ 0")) {
            throw new ArithmeticException("Делить на 0 нельзя!");
        }
    }
}

