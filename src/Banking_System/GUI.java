package Banking_System;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class GUI  extends JFrame {

	private static final long serialVersionUID = 1L;
	private Transaction transactionObject;
    private LinkedList<Account> globalAccounts;
    private JTextArea textArea;

    // Constructor
    public GUI(LinkedList<Account> accounts) {
        super("Shashank Bank Ltd.");
        getContentPane().setForeground(new Color(0, 0, 0));
        getContentPane().setBackground(new Color(136, 189, 188));
        setSize(1123, 796);
        getContentPane().setLayout(null);

        this.globalAccounts = accounts;
        this.transactionObject = new Transaction();

        JLabel lblNewLabel = new JLabel("Enter Account Number for Deposit:");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(0, 128, 192));
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel.setBounds(10, 366, 259, 26);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Amount to Deposit:");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_1.setBounds(10, 423, 219, 13);
        getContentPane().add(lblNewLabel_1);

        JTextField textField = new JTextField();
        textField.setBackground(new Color(255, 255, 255));
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        textField.setBounds(301, 370, 296, 19);
        getContentPane().add(textField);
        textField.setColumns(10);

        JTextField textField_1 = new JTextField();
        textField_1.setBackground(new Color(255, 255, 255));
        textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
        textField_1.setBounds(301, 417, 296, 19);
        getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JButton btnNewButton = new JButton("Deposit");
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
        btnNewButton.setBounds(175, 464, 113, 38);
        getContentPane().add(btnNewButton);

        JLabel lblNewLabel_2 = new JLabel("Enter Account Number for Withdrawal:");
        lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_2.setBounds(10, 210, 292, 19);
        getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Amount to Withdraw:");
        lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_3.setBounds(10, 256, 236, 13);
        getContentPane().add(lblNewLabel_3);

        JTextField textField_2 = new JTextField();
        textField_2.setBackground(new Color(255, 255, 255));
        textField_2.setFont(new Font("Arial", Font.PLAIN, 14));
        textField_2.setBounds(301, 211, 296, 19);
        getContentPane().add(textField_2);
        textField_2.setColumns(10);

        JTextField textField_3 = new JTextField();
        textField_3.setBackground(new Color(255, 255, 255));
        textField_3.setFont(new Font("Arial", Font.PLAIN, 14));
        textField_3.setBounds(301, 253, 296, 19);
        getContentPane().add(textField_3);
        textField_3.setColumns(10);

        JButton btnNewButton_1 = new JButton("Withdraw");
        btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
        btnNewButton_1.setBounds(175, 289, 113, 38);
        getContentPane().add(btnNewButton_1);

        JLabel lblNewLabel_4 = new JLabel("From Account Number:");
        lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_4.setBounds(612, 213, 259, 13);
        getContentPane().add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("TO Account Number:");
        lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_5.setBounds(612, 256, 244, 13);
        getContentPane().add(lblNewLabel_5);

        JTextField textField_4 = new JTextField();
        textField_4.setBackground(new Color(255, 255, 255));
        textField_4.setFont(new Font("Arial", Font.PLAIN, 14));
        textField_4.setBounds(792, 210, 279, 19);
        getContentPane().add(textField_4);
        textField_4.setColumns(10);

        JTextField textField_5 = new JTextField();
        textField_5.setBackground(new Color(255, 255, 255));
        textField_5.setFont(new Font("Arial", Font.PLAIN, 14));
        textField_5.setBounds(792, 253, 279, 19);
        getContentPane().add(textField_5);
        textField_5.setColumns(10);

        JLabel lblNewLabel_6 = new JLabel("Amount to Transfer:");
        lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_6.setBounds(612, 302, 152, 13);
        getContentPane().add(lblNewLabel_6);

        JTextField textField_6 = new JTextField();
        textField_6.setBackground(new Color(255, 255, 255));
        textField_6.setFont(new Font("Arial", Font.PLAIN, 14));
        textField_6.setBounds(792, 299, 279, 19);
        getContentPane().add(textField_6);
        textField_6.setColumns(10);

        JButton btnNewButton_2 = new JButton("Transfer");
        btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
        btnNewButton_2.setBounds(966, 339, 105, 38);
        getContentPane().add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Show all");
        btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 14));
        btnNewButton_3.setBounds(492, 698, 105, 38);
        getContentPane().add(btnNewButton_3);

        // JTextArea created
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(50, 600, 1000, 100);
        getContentPane().add(scrollPane);
        
        JLabel lblNewLabel_7 = new JLabel("New label");
        lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\Shashank Bank LTD. (1).png"));
        lblNewLabel_7.setBounds(-13, 0, 498, 173);
        getContentPane().add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("New label");
        lblNewLabel_8.setBackground(new Color(240, 240, 240));
        lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\Shashank Bank LTD. (3).png"));
        lblNewLabel_8.setBounds(419, 0, 432, 173);
        getContentPane().add(lblNewLabel_8);
        
        JLabel lblNewLabel_9 = new JLabel("New label");
        lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\Shashank Bank LTD. (6).png"));
        lblNewLabel_9.setBounds(851, -154, 347, 327);
        getContentPane().add(lblNewLabel_9);

        // Action listener added to handle action events
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int accountNumber = Integer.parseInt(textField.getText());
                int amount = Integer.parseInt(textField_1.getText());
                
                boolean accountFound=false;

                // Find the account
                for (Account acc : globalAccounts) {
                    if (acc.getAccountNum() == accountNumber) {
                        acc.deposit(amount); // Deposit the amount
                        JOptionPane.showMessageDialog(null, "Deposit successful!");
                        accountFound=true;
                        break;
                        
                    }
                }
                if (!accountFound) {
                	JOptionPane.showMessageDialog(null, "Account number not found!");
                }

                // Update the text area!!
                updateTextArea();
            }
        });

        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int accountNumber = Integer.parseInt(textField_2.getText());
                int amount = Integer.parseInt(textField_3.getText());
                
                boolean accountFound=false;

                // Find the account
                for (Account acc : globalAccounts) {
                    if (acc.getAccountNum() == accountNumber) {
                        if (acc.withdraw(amount)) {
                            JOptionPane.showMessageDialog(null, "Withdrawal successful!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Insufficient balance for withdrawl!");
                        }
                        accountFound=true;
                        break;
                    }
                }
                if (!accountFound) {
                	JOptionPane.showMessageDialog(null, "Account number not found");
                }

                // Update the text area!
                updateTextArea();
            }
        });

        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fromAccount = Integer.parseInt(textField_4.getText());
                int toAccount = Integer.parseInt(textField_5.getText());
                int amount = Integer.parseInt(textField_6.getText());

                Account fromAcc = null;
                Account toAcc = null;

                // Find the source and destination accounts
                for (Account acc : globalAccounts) {
                    if (acc.getAccountNum() == fromAccount) {
                        fromAcc = acc;
                    } else if (acc.getAccountNum() == toAccount) {
                        toAcc = acc;
                    }
                }

                // Transfer the amount if both accounts are found
                if (fromAcc != null && toAcc != null) {
                    if (transactionObject.transfer(fromAcc, toAcc, amount)) {
                        JOptionPane.showMessageDialog(null, "Transfer successful!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient balance for transfer!");
                    }
                }else {
                	if (fromAcc==null) {
                		JOptionPane.showMessageDialog(null, "Source account number not found!");
                	}
                	if (toAcc==null) {
                		JOptionPane.showMessageDialog(null, "Invalid destination account number!!");
                	}
                }

                // Update the text area!!
                updateTextArea();
            }
        });

        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTextArea();
            }
        });

        // Update JTextArea
        updateTextArea();
    }

    // Update JTextArea with account information
    private void updateTextArea() {
        textArea.setText(""); // Clear the text area
        for (Account acc : globalAccounts) {
            textArea.append("Account Number: " + acc.getAccountNum() + "\n");
            textArea.append("First Name: " + acc.getFirstName() + "\n");
            textArea.append("Last Name: " + acc.getLastName() + "\n");
            textArea.append("Balance: " + acc.getBalance() + "\n");
            textArea.append("------------------------\n");
        }
    }
}
