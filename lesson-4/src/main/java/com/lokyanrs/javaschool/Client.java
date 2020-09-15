package com.lokyanrs.javaschool;

public class Client {
    private final String name;
    private long amount;
    private boolean isBlocked;
    private int pin;
    private long blockedTime;

    public Client(String name, int amount, int pin) {
        this.name = name;
        this.amount = amount;
        this.pin = pin;
        this.isBlocked = false;
        this.blockedTime = 0;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public Client setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public Client setBlocked(boolean blocked) {
        isBlocked = blocked;
        return this;
    }

    public int getPin() {
        return pin;
    }

    public Client setPin(int pin) {
        this.pin = pin;
        return this;
    }

    public long getBlockedTime() {
        return blockedTime;
    }

    public Client setBlockedTime(long blockedTime) {
        this.blockedTime = blockedTime;
        return this;
    }
}
