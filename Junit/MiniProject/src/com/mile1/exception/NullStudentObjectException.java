package com.mile1.exception;

public class NullStudentObjectException extends Exception {

    public NullStudentObjectException() {
        super();
    }

    public NullStudentObjectException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "object is null";
    }
}