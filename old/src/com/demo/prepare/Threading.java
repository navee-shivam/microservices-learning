package com.demo.prepare;

class thread implements Runnable {
	final static int MAX = 10;

	@Override
	public void run() {
		print();
	}

	void print() {
		synchronized (this) {
			for (int i = 0; i <= MAX; i++) {
				System.out.println("Thread : " + i);
			}
		}
}
}

public class Threading {

	public static void main(String[] args) {
		thread thd1 = new thread();
		Thread t1 = new Thread(thd1);
		Thread t2 = new Thread(thd1);
		t1.start();
		t2.start();
	}

}
