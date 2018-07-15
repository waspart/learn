package com.aspart.art.bank;

public class AccountTest {

	public static void main(String[] args) {

		Account acc = new Account();
		acc.balance = 200;

		acc.deposit(300);
		System.out.printf("��ǰ��\t%.2f\n", acc.balance);

		try {
			acc.withdraw(400);
			System.out.printf("��ǰ��\t%.2f\n", acc.balance);
			acc.withdraw(200);
		} catch (OverdraftException e) {
			System.out.println("�������㣡");
			// e.printStackTrace();
		}

		System.out.println("end!");

		CheckingAccount cacc = new CheckingAccount(500, 500);
		cacc.deposit(1000);
		System.out.printf("1 ��ǰ��  %.2f,\t\t��͸֧��\t%.2f\n", cacc.balance, cacc.getOverdraftProtection());

		try {
			cacc.withdraw(1000);
			System.out.printf("2 ��ǰ��  %.2f,\t\t��͸֧��\t%.2f\n", cacc.balance, cacc.getOverdraftProtection());
			cacc.withdraw(800);
			System.out.printf("3 ��ǰ��  %.2f,\t\t��͸֧��\t%.2f\n", cacc.balance, cacc.getOverdraftProtection());
			cacc.withdraw(300);
		} catch (OverdraftException oe) {
			System.out.println("�������㣡��͸֧��������꣡");
			System.out.printf("4 ��ǰ��  %.2f,\t\t��͸֧��\t%.2f\n", cacc.balance, cacc.getOverdraftProtection());
			// oe.printStackTrace();
		}

	}

}
