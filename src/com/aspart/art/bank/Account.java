package com.aspart.art.bank;

public class Account {
	
	protected double balance;

	public double getBalance() {
		return balance;
	}
	
	public double deposit(double val){
		this.balance = this.balance + val;
		return this.balance;
	}
	
	public void withdraw(double val) throws OverdraftException{
		if(val <= this.balance){
			this.balance = this.balance - val;
		}else{
			throw new OverdraftException();
		}
	}

}
