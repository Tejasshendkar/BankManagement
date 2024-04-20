package bankmanagment;



public class Customer {
	String name, address;
	String mobileNumber;
	Account account;

	public void registerCustomer(String name, String address, String mobileNumber,Account account) {
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.account=account;
		
	}
    
	public Account getAccount() {
		return account;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void withdraw(double amount) {
		account.withdraw(amount);
	}

	public void deposit(double amount) {
		account.deposite(amount);
	}

	public void getBalance() {
		System.out.println("Available balance:" + account.getBalance());
	}

	public void displayCust() {
		System.out.println("Customer [name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber+ "]");
	}

}
