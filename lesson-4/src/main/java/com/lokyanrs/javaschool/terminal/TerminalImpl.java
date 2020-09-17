package com.lokyanrs.javaschool.terminal;

import com.lokyanrs.javaschool.server.TerminalServer;
import com.lokyanrs.javaschool.terminal.exceptions.AccessDeniedException;
import com.lokyanrs.javaschool.terminal.exceptions.AccountIsLockedException;
import com.lokyanrs.javaschool.terminal.exceptions.Not100MultiplicityException;

public class TerminalImpl implements Terminal {
    private final int accountId;
    private final TerminalServer terminalServer;
    private final PinValidator pinValidator;

    public TerminalImpl(int accountId) {
        this.accountId = accountId;
        terminalServer = new TerminalServer();
        pinValidator = new PinValidator(terminalServer.getAccountPin(accountId));
    }

    @Override
    public long checkAccount() {
        pinValidator.checkAccess();
        return terminalServer.getAmount(accountId);
    }

    @Override
    public void deposit(long sum) {
        pinValidator.checkAccess();
        if (sum % 100 != 0)
            throw new Not100MultiplicityException("На счёт можно вносить сумму, кратную 100");
        terminalServer.deposit(accountId, sum);
    }

    @Override
    public void withdraw(long sum) {
        pinValidator.checkAccess();
        if (sum % 100 != 0)
            throw new Not100MultiplicityException("Снимать со счёта можно сумму, кратную 100");
        terminalServer.withdraw(accountId, sum);
    }

    public boolean enterPin(int pin) {
        pinValidator.enterPin(pin);
    }
}
