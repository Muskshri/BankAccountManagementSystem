import Bank.BankAccount;
import Bank.CurrentAccount;
import Bank.SavingsAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   SavingsAccount acc1 = new SavingsAccount("Rahul",101,20000, 5000);
    CurrentAccount crracc = new CurrentAccount("Amit", 102, 10000, 5000);
    System.out.println("----- Savings Account -----");
    acc1.displayDetails();
    acc1.deposit(5000);
    acc1.withdraw(180000);
    System.out.println();

    System.out.println("----- Current Account -----");
    crracc.displayDetails();
    crracc.deposit(5000);
    crracc.withdraw(13000);
    System.out.println();
    System.out.println("----- Updated Account Details -----");
    System.out.println("Savings Account Balance: " + acc1.getBalance());
    System.out.println("Current Account Balance: "+ crracc.getBalance());


}

