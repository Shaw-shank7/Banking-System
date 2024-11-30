package Banking_System;

class Transaction {
    public boolean transfer(Account fromAcc, Account toAcc, int amount) {
        if (fromAcc.withdraw(amount)) {
            toAcc.deposit(amount);
            return true; // Successful
        } else {
            return false; // Insufficient balance
        }
    }
}