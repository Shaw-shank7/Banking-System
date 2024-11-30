package Part1;

public class Main {

    public static void main(String[] args){
        Account account1 = new Account("Paul", "Wilson", 1, 1000);
        Account account2 = new Account("Hiran", "Patel", 2, 2000);

        System.out.println(account1.getFirstName() + " " + account1.getLastName() + " - Balance: " + account1.getBalance());
        System.out.println(account2.getFirstName() + " " + account2.getLastName() + " - Balance: " + account2.getBalance());

        account1.deposit(350);
        System.out.println(account1.getFirstName() + " " + account1.getLastName() + " - New Balance after deposit: " + account1.getBalance());

        account2.withdraw(500);
        System.out.println(account2.getFirstName() + " " + account2.getLastName() + " - New Balance after withdrawal: " + account2.getBalance());

        Transaction t = new Transaction();
        t.transfer(account1, account2, 350);

        System.out.println("New Balance after transfer: ");
        System.out.println(account1.getFirstName() + " " + account1.getLastName() + " - Balance: " + account1.getBalance());
        System.out.println(account2.getFirstName() + " " + account2.getLastName() + " - Balance: " + account2.getBalance());
    }
}
