package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double som) {
        this.amount = amount + som;
    }

    public void withDraw(int som) throws LimitException{
        if (som > amount) {
            throw new LimitException("Сумма снятия не должно быть " +
                    "больше остатка. Остаток: " + amount);
        }
        if (som <= amount){
            this.amount = amount - som;
        }
    }
}
