package Part1;

class Account extends Customer {
    private int balance;
    private int accountNumber;

    Account(String FName, String LName, int accNum, int accBal) {
        setFirstName(FName);
        setLastName(LName);
        this.accountNumber = accNum;
        this.balance = accBal;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getAccountNum() {
        return this.accountNumber;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            return true; // Successfully withdrawn
        } else {
            return false; // Balance is insufficient
            
        }
    }
}