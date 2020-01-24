package com.company;

import com.exception.InvalidOperationException;
import com.exception.WrongCharacterException;

public class CheckValidation {
    public static void check(String text) {
        if (!text.matches("(?:\\s*\\d+(.\\d+)?\\s*[*+/-]\\s*)+\\d+(.\\d+)?")) {
            throw new WrongCharacterException("Вводите только положительные числа(целые или дробные, используя в качестве разделителя точку) и знаки математических операций(+-/*), не дублируя их!");
        } else if (text.contains("/0") || text.contains("/ 0")) {
            throw new InvalidOperationException("Делить на 0 нельзя!");
        }
    }
}

