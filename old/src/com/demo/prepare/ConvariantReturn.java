package com.demo.prepare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		System.out.println("check num " + p.check(num));
		return p.check(num);
	}

	public static PerformOperation isOdd() {
		return number -> number % 2 != 0;
	}

	public static PerformOperation isPrime() {
		return number -> IntStream.range(2, number).noneMatch(i -> number % i == 0);
	}

	PerformOperation isPalindrome() {
		return n -> {
			String original = Integer.toString(n);
			String reversed = new StringBuilder(Integer.toString(n)).reverse()
					.toString();
			System.out.println("original : " + original + "  \nreversed" + reversed);
			return original.equals(reversed);
		};
	}

}

public class ConvariantReturn {
	public static void main(String[] args) throws IOException {
		MyMath mathOperation = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation performOperation;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				performOperation = mathOperation.isOdd();
				ret = mathOperation.checker(performOperation, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				performOperation = mathOperation.isPrime();
				ret = mathOperation.checker(performOperation, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				performOperation = mathOperation.isPalindrome();
				ret = mathOperation.checker(performOperation, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
			}
			System.out.println(ans);
		}
	}
}
