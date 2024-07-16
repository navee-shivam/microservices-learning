package com.demo.prepare;

public class AddNumber {

	public static void main(String[] args) {
		int ii = 04652;
		Integer i = new Integer(12194);
		getNumber(i);

	}

	private static void getNumber(int i) {
		String str = Integer.toString(i);
		char[] a = str.toCharArray();
		int count = 0;
		for (char b : a) {
			if (b == '0' || b == '4' || b == '6' || b == '9') {
				count = count + 1;
			} else if (b == '8') {
				count = count + 2;
			} else {
				count = count + 0;
			}
		}
		System.out.println("count : " + count);
	}

}
