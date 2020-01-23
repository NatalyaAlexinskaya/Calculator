package com.exception;

public class WrongCharacterException extends RuntimeException {
    public WrongCharacterException(String message) {
        super(message);
    }
}
