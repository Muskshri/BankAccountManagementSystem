package Bank;

public class  SavingsAccount extends BankAccount{
    private double minimumBalance;

    public SavingsAccount(String accountHolder, int accountNumber, double balance, double minimumBalance) {
        super(accountHolder, accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing amount: "+ amount);
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return;
        }
        double bls =  getBalance();

        if(bls- amount <= minimumBalance) {
            System.out.println("insufficient balance or minimum balance requirement violated");
            return;
        }
        setBalance(bls - amount);
        System.out.println("Withdrawl Successfull");


    }

    @Override
    public String getAccountType() {
        return "Saving Account";
    }




}
