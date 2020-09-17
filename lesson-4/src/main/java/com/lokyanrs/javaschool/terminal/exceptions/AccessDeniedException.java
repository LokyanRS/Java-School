package com.lokyanrs.javaschool.terminal.exceptions;

public class AccessDeniedException extends RuntimeException {

    public AccessDeniedException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

    public AccessDeniedException(String message) {
        super(message);
    }
}
