package com.aspart.art.bank;

public class OverdraftException extends Exception {

	private double deficit;
	
	
	public double getDeficit() {
		return deficit;
	}


	public void OverdraftException(String message, double deficit){
		System.out.println(message);
		this.deficit = deficit;
	}
	
}
