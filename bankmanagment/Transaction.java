package bankmanagment;

// transferFunds(senderAccount, receiverAccount, amount): Handles the
//smooth transfer of funds between accounts owned by different customers.
// enforceWithdrawalLimit(account, amount): Enforces maximum
//withdrawal limits per transaction for enhanced security.

public class Transaction {
	      Bank bank;
           public void transferFunds(long senderAccountNo, long receiverAccountNo, double amount) {
        	   bank.transferFunds(senderAccountNo, receiverAccountNo, amount);
           }
}
