package com.demo.prepare;

public final class LongestPalindrome {

	static int resultStart;
	static int resultLength;

	public static void main(String[] args) {
		System.out.println("longest palindrome :" + longestPalindrome("abcddcbaabcdeffedcba"));
	}

	private static String longestPalindrome(String enteredString) {
		int stringLength = enteredString.length();
		if (stringLength < 2) {
			return enteredString;
		}
		for (int startIndex = 0; startIndex < stringLength - 1; startIndex++) {
			getPalindromeRange(enteredString, startIndex, startIndex);
			// getPalindromeRange(enteredString, startIndex, startIndex + 1);
		}
		return enteredString.substring(resultStart, resultStart + resultLength);
	}

	private static void getPalindromeRange(String enteredString, int start,
			int end) {
		while (start >= 0 && end < enteredString.length()
				&& enteredString.charAt(start) == enteredString.charAt(end)) {
			start--;
			end++;
		}
		if (resultLength < end - start - 1) {
			resultStart = start + 1;
			resultLength = end - start - 1;
		}
	}

}
