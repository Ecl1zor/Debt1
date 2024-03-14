package Debt.TaskAdditional;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private double interestRate;

    public String getAccountNumber() {

        return accountNumber;
    }

    public double getBalance() {

        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public BankAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Пополненик баланса  на " + amount);
        System.out.println();

    }

    public void withdraw(double withdrawMoney) {
        if (balance >= withdrawMoney) {
            balance -= withdrawMoney;
            System.out.println(withdrawMoney + "$ Списаны , ваш баланс составляет " + balance);
        } else {
            System.out.printf("Недостаточно средств");
        }
    }

    public static void addInterest(BankAccount account, double interestRate) {
        double interest = account.balance * (interestRate / 100);
        account.balance += interest;

    }

    public void transfer(BankAccount recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;
            recipient.balance += amount;
        }

    }
}

