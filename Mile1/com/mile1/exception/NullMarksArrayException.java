package com.mile1.exception;

public class NullMarksArrayException extends Exception {

    public NullMarksArrayException() {
        super();
    }

    public NullMarksArrayException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "mark array is null";
    }
}