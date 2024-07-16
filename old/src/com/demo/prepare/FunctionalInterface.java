package com.demo.prepare;

public class FunctionalInterface {

	public static void main(String[] args) {
		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int x) -> x * x;
		s.doon(5);

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);
	}

}

// @FunctionalInterface
interface Square {
	int calculate(int x);
	default void doon(int y){
		System.out.println("hai");
	}
}