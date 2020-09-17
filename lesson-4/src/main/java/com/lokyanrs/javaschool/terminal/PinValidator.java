package com.lokyanrs.javaschool.terminal;

import com.lokyanrs.javaschool.terminal.exceptions.AccessDeniedException;
import com.lokyanrs.javaschool.terminal.exceptions.AccountIsLockedException;

public class PinValidator {
    private int correctPin;
    private int numberOfWrongPins;
    private boolean accessGranted;

    public PinValidator(int correctPin) {
        this.correctPin = correctPin;
        this.numberOfWrongPins = 0;
        this.accessGranted = false;
    }

    /**
     * Проверить пин-код
     *
     * @param pin пин код, введенный пользователем
     */
    public void enterPin(int pin) throws AccountIsLockedException {
        if (correctPin == pin) {
            numberOfWrongPins = 0;
            accessGranted = true;
        } else {
            numberOfWrongPins += 1;
            if (numberOfWrongPins == 3)
                throw new AccountIsLockedException("Аккаунт был заблокирован");
            else accessGranted = false;
        }
    }

    public void checkAccess() {
        if(!accessGranted)
            throw new AccessDeniedException("Отсутствует доступ. Вветиде пин-код");
    }

}