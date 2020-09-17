package com.lokyanrs.javaschool.terminal.exceptions;

public class AccountIsLockedException extends Exception {

    public AccountIsLockedException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

    public AccountIsLockedException(String message) {
        super(message);
    }
}
