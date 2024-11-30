package Part2;

class Transaction {
    public boolean transfer(Account acc1, Account acc2, int amount) {
        if (acc1.withdraw(amount)) {
            acc2.deposit(amount);
            return true; // Transfer successful
        } else {
            return false; // Insufficient balance
        }
    }
}
