package com.aspart.art.bank;

public class AccountTest {

	public static void main(String[] args) {

		Account acc = new Account();
		acc.balance = 200;

		acc.deposit(300);
		System.out.printf("当前余额：\t%.2f\n", acc.balance);

		try {
			acc.withdraw(400);
			System.out.printf("当前余额：\t%.2f\n", acc.balance);
			acc.withdraw(200);
		} catch (OverdraftException e) {
			System.out.println("您的余额不足！");
			// e.printStackTrace();
		}

		System.out.println("end!");

		CheckingAccount cacc = new CheckingAccount(500, 500);
		cacc.deposit(1000);
		System.out.printf("1 当前余额：  %.2f,\t\t可透支：\t%.2f\n", cacc.balance, cacc.getOverdraftProtection());

		try {
			cacc.withdraw(1000);
			System.out.printf("2 当前余额：  %.2f,\t\t可透支：\t%.2f\n", cacc.balance, cacc.getOverdraftProtection());
			cacc.withdraw(800);
			System.out.printf("3 当前余额：  %.2f,\t\t可透支：\t%.2f\n", cacc.balance, cacc.getOverdraftProtection());
			cacc.withdraw(300);
		} catch (OverdraftException oe) {
			System.out.println("您的余额不足！可透支额度已用完！");
			System.out.printf("4 当前余额：  %.2f,\t\t可透支：\t%.2f\n", cacc.balance, cacc.getOverdraftProtection());
			// oe.printStackTrace();
		}

	}

}
