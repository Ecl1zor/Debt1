package Debt.TaskAdditional;

public class MainBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("121", 137,5);
     BankAccount account1 = new BankAccount("363",27,5);
      account.deposit(50);
        System.out.println("Баланс Аккаунта " + account.getAccountNumber() + " составляет : " + account.getBalance());
        account.withdraw(147);
       BankAccount.addInterest(account , account.getInterestRate() );
       System.out.println("Процентная ставка: " + account.getInterestRate());
        System.out.println("Баланс Аккаунта с процентами " + account.getAccountNumber() + " составляет : " + account.getBalance());
        System.out.println("Баланс Аккаунта  " + account1.getAccountNumber() + " составляет : " +account1.getBalance());
        account.transfer(account1,11);
        System.out.println();
        System.out.println("Баланс Аккаунта " + account.getAccountNumber() + " составляет : " + account.getBalance());
        System.out.println("Баланс Аккаунта " + account1.getAccountNumber() + " составляет : " +account1.getBalance());
    }

}
