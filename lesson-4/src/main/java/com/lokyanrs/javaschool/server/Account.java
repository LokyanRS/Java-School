package com.lokyanrs.javaschool.server;

public class Account {
    /**
     * Номер счета
     */
    private final int accountId;

    /**
     * Остаток на счете
     */
    private long amount;

    /**
     * Пин-код счета
     */
    private int pin;

    /**
     * Время блокировки
     */
    private long blockedTime;

    public Account(int accountId, int amount, int pin) {
        this.accountId = accountId;
        this.amount = amount;
        this.pin = pin;
        this.blockedTime = 0;
    }

    public long getAmount() {
        return amount;
    }

    public Account setAmount(long amount) {
        this.amount = amount;
        return this;
    }

    public int getPin() {
        return pin;
    }

    public Account setPin(int pin) {
        this.pin = pin;
        return this;
    }

    public long getBlockedTime() {
        return blockedTime;
    }

    public Account setBlockedTime(long blockedTime) {
        this.blockedTime = blockedTime;
        return this;
    }

    public int getAccountId() {
        return accountId;
    }
}
