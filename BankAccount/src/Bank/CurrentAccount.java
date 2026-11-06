package Bank;


//3. Create child class: CurrentAccount
//It should inherit from BankAccount.
//
//        Additional variable
//
//- double overdraftLimit
//
//Constructor
//- Initialize parent class variables using super().
//        - Initialize overdraftLimit.
//Methods
//
//Override withdraw(double amount):
//        - Amount must be greater than zero.
//        - The account can be overdrawn up to the specified overdraftLimit.
//        - If the withdrawal exceeds the available balance plus overdraft limit, reject it.
//        Override getAccountType():

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, int accountNumber, double balance, double overdraftLimit) {
        super(accountHolder, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing Amount: " + amount);
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return;
        }

        double balance = getBalance();
        if(amount > balance + overdraftLimit){
            System.out.println("Amount greater than minimum balance");
            return;
        }
        setBalance(balance - amount);
        System.out.println("Withdrawl Successfull");
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }

}
