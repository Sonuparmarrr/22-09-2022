package exercises4.inheritanceinterface.pll;

import exercises4.inheritanceinterface.bll.BankAccount;
import exercises4.inheritanceinterface.bll.BusinessAccount;
import exercises4.inheritanceinterface.bll.CurrentAccount;
import exercises4.inheritanceinterface.bll.SalaryAccount;

public class TestBankAccount {
	public static void main(String[] args){
	BankAccount acc1 = null;
	//
	System.out.println("1. Salary Account");
	System.out.println("*************");
	
	acc1 = new SalaryAccount(10000);//balance set
	
	System.out.println("Balance: " + acc1.getBalance());
	
	acc1.deposit(5000);//depositing amount
	
	System.out.println("After depositing the balance: " + acc1.getBalance());//balance after deposited
	
	if(acc1.withdraw(10000)) {//withdraw amount
		System.out.println("Withdrawal happened successfully.");
	}
	else {
		System.out.println("Insufficient balance.");
	}
	
	System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal
	
	
	

	
	System.out.println("2. Saving Account");
	System.out.println("*************");
	
	acc1 = new CurrentAccount(10000);//balance set
	
	
	System.out.println("Balance: " + acc1.getBalance());
	
	acc1.deposit(2000);//deposit amount
	
	System.out.println("After depositing the balance: " + acc1.getBalance());//balance after deposited
	
	if(acc1.withdraw(25000)) { //withdraw amount
		System.out.println("Withdrawal happened successfully.");
	}
	else {
		System.out.println("Insufficient balance.");
	}
	
	System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal
	
	
	
	
	
	
	System.out.println("3. Business Account");
	System.out.println("*************");
	
	acc1 = new BusinessAccount(250000);//set balance

	
	System.out.println("Balance: " + acc1.getBalance());
	
	acc1.deposit(5000);//deposit amount
	
	System.out.println("After depositing the balance: " + acc1.getBalance());//balance after depositing
	
	
	if(acc1.withdraw(2000)) { //withdraw amount
		System.out.println("Withdrawal happened successfully.");
	}
	else {
		System.out.println("Insufficient balance.");
	}
	
	System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal
}
}

