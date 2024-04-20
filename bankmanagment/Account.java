package bankmanagment;

public class Account {
	  
	long accountNumber ;
	double balance;
	
	public Account(long accountNumber, double balance) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public  long getAccountNumber() {
		return accountNumber;
	}

	
	public void deposite(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + " is Deposited successful");
		} else {
			System.out.println("amount should be grater than 0");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			if (amount < balance) {
				balance -= amount;
				System.out.println(amount + " is withdraw successful");
			}else {
				System.out.println("insufficient balance");
			}
		}
		else {
			System.out.println("amount should be grater than 0");
		}
	}

	public void applyInterest() {
		double intrest = 0.07;
		balance += balance * intrest;
	}


	public void displayAcc() {
		System.out.println("Account number: "+accountNumber +" balance=:" + balance) ;
	}
	
	

}
