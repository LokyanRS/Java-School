package com.lokyanrs.javaschool.server;

import com.lokyanrs.javaschool.server.exceptions.AccountNotFoundException;
import com.lokyanrs.javaschool.server.exceptions.InsufficientAmountException;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

public class TerminalServer {
    private static final long TEN_SECONDS = 10L;

    /**
     * Тестовые данные
     */
    private static final List<Account> ACCOUNTS = Arrays.asList(
            new Account(1, 1_000, 1234),
            new Account(2, 10_000, 6789),
            new Account(3, 1_000_000, 9876),
            new Account(4, 59_178, 1598));

    public void blockAccount(int accountId) {
        Account account = findAccount(accountId);
        account.setBlockedTime(ZonedDateTime.now().toEpochSecond());
    }

    public boolean isAccountBlocked(int accountId) {
        Account account = findAccount(accountId);
        long currentTime = ZonedDateTime.now().toEpochSecond();
        return (currentTime - account.getBlockedTime()) < TEN_SECONDS;
    }

    public long getAmount(int accountId) {
        Account account = findAccount(accountId);
        return account.getAmount();
    }

    public void deposit(int accountId, long amount) {
        Account account = findAccount(accountId);
        account.setAmount(account.getAmount() + amount);
    }

    public void withdraw(int accountId, long amount) {
        Account account = findAccount(accountId);
        if (account.getAmount() < amount)
            throw new InsufficientAmountException("Недостаточно средств на счете. Попробуйте указать другую сумму");
        account.setAmount(account.getAmount() - amount);
    }

    public int getAccountPin(int accountId){
        return findAccount(accountId).getPin();
    }

    private Account findAccount(int accountId) {
        Account account = ACCOUNTS.stream().filter(c -> c.getAccountId() == accountId).findFirst().orElse(null);
        if (account == null)
            throw new AccountNotFoundException("Не удалось найти клиента. Введите корректный номер счета");
        return account;
    }
}
