package com.demo.prepare;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.lang.FunctionalInterface;

public class alti {
	public static void main(String args[]) {
		List<Integer> aa = new ArrayList<>();
		aa.add(10);
		aa.add(2);
		aa.add(3);
		aa.add(1);
		aa.add(7);
		int[] ab = { 1, 5, 3, 8, 0, 3 };
		method(ab);
		method(aa);
	}

	private static void method(int[] aa) {
		System.out.println(IntStream.of(aa).sum());
	}

	private static void method(List<Integer> aa) {
		int a = aa.stream().mapToInt(mapper -> mapper).sum();
		System.out.println(a);
	}

}

@FunctionalInterface
interface function {
	void show(int a, int b, int c, int d);
}