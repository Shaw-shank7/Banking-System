package Part2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args){

        String filePath = "D:\\Semester 2\\Introduction to OOP\\Banking_System\\src\\Part2\\Accounts.csv";
        ReadAccounts readAccs = new ReadAccounts(filePath);

        LinkedList<String> firstNames = readAccs.getFirstNames();
        LinkedList<String> lastNames = readAccs.getLastNames();
        LinkedList<Integer> accountList = readAccs.getAccounts();
        LinkedList<Integer> balanceList = readAccs.getBalances();

        LinkedList<Account> accounts = new LinkedList<>(); 
        
        for (int i = 0; i < firstNames.size(); i++) {
            accounts.add(new Account(firstNames.get(i), lastNames.get(i), accountList.get(i), balanceList.get(i)));
        }
        
        Account account1 = accounts.get(0);
        Account account2 = accounts.get(1);

        System.out.println("Actual Amount for " + account1.getFirstName() + " " + account1.getLastName());
        System.out.println(account1.getBalance());

        System.out.println("Actual Amount for " + account2.getFirstName() + " " + account2.getLastName());
        System.out.println(account2.getBalance());

        account1.deposit(250);
        System.out.println("Deposited Amount for " + account1.getFirstName() + " " + account1.getLastName());
        System.out.println(account1.getBalance());

        account2.withdraw(10);
        System.out.println("Withdrawn Amount for " + account2.getFirstName() + " " + account2.getLastName());
        System.out.println(account2.getBalance());

        Transaction t = new Transaction();
        t.transfer(account1, account2, 250);

        System.out.println("New Balance for " + account1.getFirstName() + " " + account1.getLastName());
        System.out.println(account1.getBalance());

        System.out.println("New Balance for " + account2.getFirstName() + " " + account2.getLastName());
        System.out.println(account2.getBalance());
    }
}
