package bankmanagment;

public class Bank {

	final String NAME = "SBI";
	static double interestRate = 0.07;
	static double maxWithdrawalLimit = 100000;
	int MAX_SIZE = 10;
	Account account[] = new Account[MAX_SIZE];
	Customer customer[] = new Customer[MAX_SIZE];
	static int size = 0;

	public void addAccount(String name, String address, String mobileNumber, double balance) {
		if (size <= MAX_SIZE) {
			long accno = UtilAccountCreation.getAccNo();
			account[size] = new Account(accno, balance);
			account[size].getAccountNumber();
			customer[size] = new Customer();
			customer[size].registerCustomer(name, address, mobileNumber, account[size]);

			size++;
		} else
			System.out.println("Bank is full");

	}

	public void removeAccount(long accountNumber) {
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			if (account[i].getAccountNumber() == accountNumber) {
				flag = true;
				account[i] = account[size - 1];
				customer[i] = customer[size - 1];

				account[size - 1] = null;
				customer[size - 1] = null;
				size--;
				System.out.println("Account deleted successful");
			}
		}
		if (flag == false) {
			System.out.println("Acccount not found of  account number: " + accountNumber);
		}
	}

	public void displayCustomerDetails() {
		for (int i = 0; i < size; i++) {
			customer[i].displayCust();
			account[i].displayAcc();
		}
	}

	public void updateMobileNumber(long accountNumber, String newMobileNumber) {
		boolean flag = false;
		for (int i = 0; i < size; i++) {

			if (account[i].getAccountNumber() == accountNumber) {
				flag = true;
				customer[i].setMobileNumber(newMobileNumber);
				System.out.println("mobile number changed...");
			}

		}
		if (flag = false) {
			System.out.println("Customer not found of accounnt number:" + accountNumber);
		}
	}

	public void transferFunds(long senderAccountNo, long receiverAccountNo, double amount) {
		if (amount > 0) {
			for (int i = 0; i < size; i++) {
				if (account[i].getAccountNumber() == senderAccountNo) {
					for (int j = 0; j < size; j++) {
						if (account[j].getAccountNumber() == receiverAccountNo) {
							if (account[i].balance > amount) {
								account[i].balance -= amount;
								account[j].balance += amount;
								System.out.println(amount+" transfer successful");
							} else {
								System.out.println("insufficient balance in sendr account");
							}
							
							break;
						} 
					}

				} 
			}
		} else {
			System.out.println("Amount should be grater than 0");
		}
	}

	public void withdraw(long accNo, double amount) {
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			if (customer[i].getAccount().accountNumber == accNo) {
				customer[i].withdraw(amount);

				flag = true;
			}

		}
		if (flag == false) {
			System.out.println("customer not found of account no" + accNo);
		}

	}

	public void deposit(long accNo, double amount) {
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			if (customer[i].getAccount().accountNumber == accNo) {
				customer[i].deposit(amount);
				flag = true;
			}

		}
		if (flag == false) {
			System.out.println("customer not found of account no" + accNo);
		}
	}
	
	public void getbalance(long accNo) {
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			if (customer[i].getAccount().accountNumber == accNo) {
				customer[i].getBalance();

				flag = true;
			}

		}
		if (flag == false) {
			System.out.println("customer not found of account no" + accNo);
		}

	}

}
