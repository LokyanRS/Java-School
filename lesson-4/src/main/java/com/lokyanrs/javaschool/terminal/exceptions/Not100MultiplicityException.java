package com.lokyanrs.javaschool.terminal.exceptions;

public class Not100MultiplicityException extends RuntimeException {

    public Not100MultiplicityException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

    public Not100MultiplicityException(String message) {
        super(message);
    }
}
