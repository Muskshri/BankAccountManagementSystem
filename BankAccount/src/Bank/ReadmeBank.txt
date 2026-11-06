Problem: Bank Account Management System
Problem Statement
You are developing a simple Bank Account Management System.

A bank offers different types of accounts. Every account has some common information and operations, but different account types have their own rules.

Your task is to implement this system using OOP concepts in Java.
1. Create an abstract parent class: BankAccount
Every bank account should have:

Variables (Encapsulation)
- String accountHolder
- int accountNumber
- double balance
All variables must be private.

Constructor

- Initialize all three variables using a constructor.

Methods
1. deposit(double amount)
   - Deposit the given amount into the account.
   - Amount must be greater than zero.
2. withdraw(double amount)
   - Declare this method as abstract.
   - Different account types will have different withdrawal rules.
3. getBalance()
   - Return the current balance.
4. displayDetails()
   - Display account holder, account number and balance.
5. getAccountType()
   - Declare this method as abstract.
   - Child classes must return their account type.


2. Create child class: SavingsAccount
It should inherit from BankAccount.
Additional variable
- double minimumBalance
Constructor
- Initialize parent class variables using super().
- Initialize minimumBalance.
Methods

Override withdraw(double amount):
- Amount must be greater than zero.
- After withdrawal, the remaining balance must not fall below minimumBalance.
- Otherwise, print "Insufficient balance or minimum balance requirement violated".
Override getAccountType():

- Return "Savings Account".

3. Create child class: CurrentAccount
It should inherit from BankAccount.

Additional variable

- double overdraftLimit

Constructor
- Initialize parent class variables using super().
- Initialize overdraftLimit.
Methods

Override withdraw(double amount):
- Amount must be greater than zero.
- The account can be overdrawn up to the specified overdraftLimit.
- If the withdrawal exceeds the available balance plus overdraft limit, reject it.
Override getAccountType():

- Return "Current Account".
4. Main class: Main
Create the following objects:

Savings Account
- Account Holder: Rahul
- Account Number: 101
- Initial Balance: ₹20,000
- Minimum Balance: ₹5,000
Current Account
- Account Holder: Amit
- Account Number: 102
- Initial Balance: ₹10,000
- Overdraft Limit: ₹5,000
Perform these operations:
1. Display account details.
2. Deposit ₹5,000 into both accounts.
3. Withdraw ₹18,000 from the savings account.
4. Withdraw ₹13,000 from the current account.
5. Display updated account details.
5. Expected Output
Your output should look something like this:

----- Savings Account -----
Account Holder: Rahul
Account Number: 101
Balance: 20000.0
Account Type: Savings Account

Depositing 5000.0
Withdrawing 18000.0
Insufficient balance or minimum balance requirement violated

----- Current Account -----
Account Holder: Amit
Account Number: 102
Balance: 10000.0
Account Type: Current Account

Depositing 5000.0
Withdrawing 13000.0
Withdrawal successful

----- Updated Account Details -----
Savings Account Balance: 25000.0
Current Account Balance: 2000.0