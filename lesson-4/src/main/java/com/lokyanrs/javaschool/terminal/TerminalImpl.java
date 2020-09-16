package com.lokyanrs.javaschool.terminal;

import com.lokyanrs.javaschool.server.TerminalServer;
import com.lokyanrs.javaschool.terminal.exceptions.Not100MultiplicityException;
import com.lokyanrs.javaschool.validator.PinValidator;

public class TerminalImpl implements Terminal {
    private final int accountId;
    private final TerminalServer terminalServer;
    private PinValidator pinValidator;

    public TerminalImpl(int accountId, String pin) {
        this.accountId = accountId;
        terminalServer = new TerminalServer();
    }

    @Override
    public long checkAccount() {
        return terminalServer.getAmount(accountId);
    }

    @Override
    public void deposit(long sum) {
        if (sum % 100 != 0)
            throw new Not100MultiplicityException("На счёт можно вносить сумму, кратную 100");
        terminalServer.deposit(accountId, sum);
    }

    @Override
    public void withdraw(long sum) {
        if (sum % 100 != 0)
            throw new Not100MultiplicityException("Снимать со счёта можно сумму, кратную 100");
        terminalServer.withdraw(accountId, sum);
    }
}
