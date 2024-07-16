package com.demo.prepare;

import java.util.ArrayList;
import java.util.List;

public class occuranceNumber {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(2);
		a.add(1);
		a.add(0);

		int b = occurace(a, 0);
		System.out.println(b);
	}

	private static int occurace(List<Integer> a, int value) {
		int count = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == value) {
				count++;
			}
		}
		return count;
	}

}
