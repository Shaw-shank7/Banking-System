package Part1;

class Transaction {
    public boolean transfer(Account fromAcc, Account toAcc, int amount) {
        if (fromAcc.withdraw(amount)) {
            toAcc.deposit(amount);
            return true; // Transfer successful
        } else {
            return false; // Insufficient balance
        }
    }
}
