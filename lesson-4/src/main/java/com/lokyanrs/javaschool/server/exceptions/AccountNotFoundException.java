package com.lokyanrs.javaschool.server.exceptions;

public class AccountNotFoundException extends RuntimeException {

    public AccountNotFoundException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

    public AccountNotFoundException(String message) {
        super(message);
    }
}
