package com.aspart.art.bank;

public class CheckingAccount extends Account {

	private double overdraftProtection;

	public double getOverdraftProtection() {
		return overdraftProtection;
	}

	public void withdraw(double amt) throws OverdraftException {
		if(this.balance >= amt){
			this.balance = this.balance - amt;
		}else if(this.balance + overdraftProtection >= amt){
			this.overdraftProtection = this.overdraftProtection - (amt - this.balance);
			this.balance = 0;
		}else{
			throw new OverdraftException();
		}
	}

	public CheckingAccount(double balance) {
		this.balance = balance;
	}

	public CheckingAccount(double balance, double protect) {
		this.balance = balance;
		this.overdraftProtection = protect;
	}
}
