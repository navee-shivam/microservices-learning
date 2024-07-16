package com.demo.prepare;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzBuzz(15);
	}

	public static void fizzBuzz(int n) {
		// Write your code here
		for (int index = 1; index <= n; index++) {
			if (index >= 3) {
				if (index % 3 == 0 && index % 5 == 0) {
					System.out.println("FizzBuzz");
				} else if (index % 3 == 0) {
					System.out.println("Fizz");
				} else if (index % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(index);
				}
			} else {
				System.out.println(index);
			}
		}

	}
}
