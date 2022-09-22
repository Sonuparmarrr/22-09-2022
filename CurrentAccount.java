package exercises4.inheritanceinterface.bll;
public class CurrentAccount implements BankAccount {
private double balance;
	
	public CurrentAccount() {
		super();
		
	}

	public CurrentAccount(double balance) {//set balance
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {//deposit
		balance += amount;
		
	}

	@Override
	public boolean withdraw(double amount) {//withdrawal
		
		if((balance - 4000) >= amount) {//minimum balance 4000
			balance -= amount;
			return true;
		}
		
		return false;
	}

}