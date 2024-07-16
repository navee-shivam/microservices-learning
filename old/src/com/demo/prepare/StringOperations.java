package com.demo.prepare;

public class StringOperations {

	public static void main(String... args) {
		String s = new String("qwertyuiopasdf");

		StringBuilder builder = new StringBuilder();
		builder.append("fdsaqwertyuiop");

		char[] ch = s.toCharArray();
		StringOperations str = new StringOperations();

		System.out.println("char :" + str.anagram(builder.toString(), s));
		// String str = "Naveen";
		// System.out
		// .println(str.substring(0, 2) + str.substring(2 + 1, str.length()));
	}

	public static void main(int b) {

		System.out.println(b);
	}

	private boolean anagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}

		char[] chars = word.toCharArray();
		// System.out.println("Anagram Check : " + anagram.indexOf("t"));
		for (char c : chars) {
			System.out.println("Character : " + c);
			int index = anagram.indexOf(c);
			System.out.println("index : " + index);
			if (index != -1) {
				anagram = anagram.substring(0, index)
						+ anagram.substring(index + 1, anagram.length());
				System.out.println(anagram);
			} else {
				return false;
			}
		}

		return anagram.isEmpty();
	}

}
