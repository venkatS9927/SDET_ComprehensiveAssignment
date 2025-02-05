package org.example;

// Base Class - Account
class Account {
    protected double balance;
    protected double interestRate;

    // Constructor to initialize balance and interest rate
    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

// Derived Class - SavingsAccount
class SavingsAccount extends Account {

    // Constructor to initialize SavingsAccount specific attributes
    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    // Overriding calculateInterest method for SavingsAccount
    @Override
    public void calculateInterest() {
        // Savings account interest is calculated differently (example: compounded interest)
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest added to Savings Account.");
    }

    // Method to display Savings Account specific balance
    public void displayBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }
}

// Derived Class - CurrentAccount
class CurrentAccount extends Account {

    // Constructor to initialize CurrentAccount specific attributes
    public CurrentAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    // Overriding calculateInterest method for CurrentAccount
    @Override
    public void calculateInterest() {
        // Current account has no interest or a different calculation
        System.out.println("No interest for Current Account.");
    }

    // Method to display Current Account specific balance
    public void displayBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects for SavingsAccount and CurrentAccount
        Account savings = new SavingsAccount(1000, 5); // 5% interest rate
        Account current = new CurrentAccount(2000, 0); // No interest rate

        // Display initial balances
        savings.displayBalance();
        current.displayBalance();

        // Calculate and add interest to both accounts
        savings.calculateInterest();
        current.calculateInterest();

        // Display final balances after interest
        savings.displayBalance();
        current.displayBalance();
    }
}
