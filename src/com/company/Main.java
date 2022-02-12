package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);

        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());
            } catch (LimitException limitException) {
                System.out.println(limitException.getMessage());
                double a = bankAccount.getAmount();
                int b = (int)a;
                bankAccount.withDraw(b);
                System.out.println(bankAccount.getAmount());
                break;
            }
        }
    }
}
