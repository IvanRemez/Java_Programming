package day18_garbageCollection;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: $" + balance);
    }
    public void deposit(double amount){

        if (amount < 1){
            System.out.println("Invalid deposit amount: $" + amount);
            return;
        }
        if (amount > 10000){
            System.out.println("Unable to deposit more than $10,000 a day");
            return;
        }
        System.out.println("Depositing $" + amount + " to " + accountHolder);
        balance += amount;
    }
    public void withdraw(double amount){

        if (amount > balance){
            System.out.println("Insufficient account balance: $" + balance);
            return;
        }
        if (amount > 5000){
            System.out.println("Unable to withdraw more than $5,000 a day");
            return;
        }
        System.out.println("Withdrawing $" + amount + " from " + accountHolder);
        balance -= amount;
    }
}
/*
2. Create a custom class named BankAccount:

			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance

			Actions:
			1. setInfo(): sets the accountHolder and accountNumber attributes
		    2. toString(): displays the full account info
		    3. checkBalance():displays the available balance
		    4. deposit(amount): increases the balance by the specified amount
		    5. withdraw(amount): decreases the balance by the specified amount
 */