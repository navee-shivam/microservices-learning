package com.demo.prepare;

class Customer {

	int balance = 10000;

	public synchronized void withdraw(int amount) {
		System.out.println("Withdraw Starts");
		if (balance - amount <= 0) {
			System.out.println("Out of balance .... Waiting for deposit");
			try {
				wait(1);
				System.out.println("After notified");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance = balance - amount;
		System.out.println("Remaining balance : " + (balance >= 0 ? balance : 0));
	}

	public synchronized void deposit(int amount) {
		System.out.println("Deposit starts");
		balance = balance + amount;
		System.out.println(
				"Balance added : " + amount + " Remaining balance : " + balance);
		notify();
	}
}

public class AtmWithDrawThreading {

	public static void main(String[] args) {
		Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(50000);
			}
		}.start();

		new Thread() {
			public void run() {
				c.deposit(90000);
			}
		}.start();

	}

}
