package Bank;

public abstract class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("Depositing: " + amount);
        if (amount <= 0) {
            System.out.println("Amount should be greater than 0");
        }
        balance = balance + amount;
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return this.balance;
    }


    public void displayDetails() {
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Balance: " + getBalance());

    }
    public abstract String getAccountType();

}

