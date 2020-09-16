package com.lokyanrs.javaschool.server.exceptions;

public class InsufficientAmountException extends RuntimeException {

    public InsufficientAmountException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

    public InsufficientAmountException(String message) {
        super(message);
    }
}
