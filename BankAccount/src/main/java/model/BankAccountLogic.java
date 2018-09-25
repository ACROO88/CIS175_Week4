package model;

public class BankAccountLogic {
	BankAccount acct;
	
	public double deposit(double amount, BankAccount acct) {
		
		double balance = acct.getBalance();
		double newBalance = balance + amount;
		return newBalance;
	
	}
	
	public double withdraw(double amount, BankAccount acct){
		double balance = acct.getBalance();
		double newBalance = balance - amount;
		return newBalance;
	}
	
	public String displayFullName(BankAccount acct) {
		String fName = acct.getFirstName();
		String lName = acct.getLastName();
		String fullName = fName + " " + lName;
		return fullName;
	}
}
