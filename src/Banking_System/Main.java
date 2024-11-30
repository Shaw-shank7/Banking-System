package Banking_System;

import java.util.LinkedList;

import javax.swing.JFrame;

public class Main {

	 public static void main(String[] args) {
	        String filePath = "D:\\Semester 2\\Introduction to OOP\\Banking_System\\src\\Banking_System\\Accounts.csv";
	        ReadAccounts readAccs = new ReadAccounts(filePath);

	        LinkedList<String> firstNames = readAccs.getFirstNames();
	        LinkedList<String> lastNames = readAccs.getLastNames();
	        LinkedList<Integer> accountList = readAccs.getAccounts();
	        LinkedList<Integer> balanceList = readAccs.getBalances();

	        LinkedList<Account> accounts = new LinkedList<>();

	        for (int i = 0; i < firstNames.size(); i++) {
	            accounts.add(new Account(firstNames.get(i), lastNames.get(i), accountList.get(i), balanceList.get(i)));
	        }

	        GUI gui = new GUI(accounts);
	        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        gui.setVisible(true);
	    }
	}

