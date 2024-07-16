package com.demo.prepare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LearnCollections {

	public static void main(String[] args) throws CloneNotSupportedException {
//		doCheckStrings("poe", "bca");
		doObjectClone();
	}

	private static void doObjectClone() throws CloneNotSupportedException {
		A aClass = new A(5);
		aClass.name();

		A bClass = (A) aClass.clone();
		bClass.name();

	}

	private static boolean doCheckStrings(String str1, String str2) {
		long start = System.currentTimeMillis();
		List<Long> arrayList = new ArrayList<>();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		for (long i = 0; i < 1000000; i++) {
			arrayList.add(i);
		}
		Arrays.parallelSort(ch1);
		arrayList.parallelStream().sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
		// System.out.println(arrayList);
		long end = System.currentTimeMillis();
		System.out.println("Counting to 10000000 takes " + (end - start) + "ms");
		return true;
	}
}

class A implements Cloneable {
	private int i;

	A(int i) {
		this.i = i;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	void name() {
		System.out.println("hai : " + i);
	}
}
