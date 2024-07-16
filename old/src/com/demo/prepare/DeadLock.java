package com.demo.prepare;

class DeadLock {

	public static void main(String[] args) {
		final String f1 = "Naveen";
		final String f2 = "Kumar";
		Thread t1 = new Thread() {
			public void run() {
				synchronized (f1) {
					System.out.println("T1 : locked f1 :" + f1);
					try {
						Thread.sleep(1000);
						System.out.println("T1 sleep over");
					} catch (Exception e) {
					}
					synchronized (f2) {
						System.out.println("T1 : locked f2 :" + f2);
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (f2) {
					System.out.println("T2 : locked f2 :" + f2);
					try {
						Thread.sleep(1000);
						System.out.println("T2 sleep over");
					} catch (Exception e) {
					}
					synchronized (f1) {
						System.out.println("T2 : locked f1 :" + f1);
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}
