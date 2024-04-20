package bankmanagment;

import java.util.Scanner;

public class TestBank {
	public static void main(String[] args) {
		Bank sbi = new Bank();
		int choice;
		long AccountNo,RAccountNo;
		double amt;
		String name, add, mnum;
		boolean exit = true;
		Scanner sc = new Scanner(System.in);
		

		while (exit) {
			System.out.println("1.Open Account\n2.Remove Account\n3.Withdraw\n4.Deposite\n5.Transfer\n6.Display all customer\n7.Check balance\n0.Exit");
			System.out.println("\nEnter choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the Name");
				name = sc.next();
				System.out.println("enter the Address");
				add = sc.next();
				System.out.println("enter the mobile number");
				mnum = sc.next();
				System.out.println("enter the balance");
				double bal=sc.nextDouble();
				sbi.addAccount(name, add, mnum,bal);
			break;
			case 2:
				System.out.println("Enter Account number");
				 AccountNo=sc.nextLong();
				sbi.removeAccount(AccountNo);
				break;
			case 3:
				System.out.println("Enter Account number");
				AccountNo=sc.nextLong();
				System.out.println("enter amount to Withdraw");
				amt=sc.nextDouble();
				sbi.withdraw(AccountNo, amt);
				break;
			case 4:
				System.out.println("Enter Account number");
				AccountNo=sc.nextLong();
				System.out.println("enter amount to Depsite");
				amt=sc.nextDouble();
				sbi.deposit(AccountNo, amt);
				break;
			case 5:
				System.out.println("Enter Account number of sender");
				AccountNo=sc.nextLong();
				System.out.println("Enter Account number of reciver");
				RAccountNo=sc.nextLong();
				System.out.println("enter amount to transfer");
				amt=sc.nextDouble();
				sbi.transferFunds(AccountNo, RAccountNo,amt);
				break;
				
			case 6 :
				sbi.displayCustomerDetails();
				break;
			case 7 : 
				    System.out.println("Enter Account number");
					AccountNo=sc.nextLong();
					sbi.getbalance(AccountNo);
				break;
			case 0 :
				exit=false;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

	}
}
