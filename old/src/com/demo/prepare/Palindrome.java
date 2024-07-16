/**
 *
 */
package com.demo.prepare;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.stream.IntStream;

/**
 * @author Steny Adams J
 *
 */
public class Palindrome {

	static class abc implements Serializable {
		transient int b = 10;
		static int c = 10;

		abc(int b, int c) {
			this.b = b;
			this.c = c;
		}

	}

	/**
	 * @param args
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		// String data = "abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba";
		String data = "The name is naveen 121";
		Object dat = "madam";
		int a = 10233201;
		abc abc = new abc(25, 30);

//		FileOutputStream fis = new FileOutputStream(
//				"C:/Users/navee/Desktop/object.txt");
//		ObjectOutputStream ois = new ObjectOutputStream(fis);
//		ois.writeObject(abc);
//		ois.flush();
//		ois.close();
//		System.out.println("Completed");
//		System.out.println("deserialize");
//
//		ObjectInputStream os = new ObjectInputStream(
//				new FileInputStream("C:/Users/navee/Desktop/object.txt"));
//		abc = (com.demo.prepare.Palindrome.abc) os.readObject();
//		System.out.println(abc.b + "" + abc.c);
//		os.close();

		 System.out.println(isPalindrome(data.toLowerCase(), 0, data.length() -
		 1));
		 System.out.println(isPalindromeAPI(dat));
//		 System.out.println(isPalindromeLambda(a));
	}

	private static boolean isPalindrome(String data, int start, int end) {
		if (start == end) {
			return true;
		}
		/**
		 * Compare the first and last character if not same then they are not
		 * palindrome.
		 */
		if (data.charAt(start) != data.charAt(end)) {
			return false;
		}

		if (start < end + 1) {
			/**
			 * 1st loop (TeneT,1,3) It check e and e then.
			 */
			return isPalindrome(data, start + 1, end - 1);
		}
		return true;
	}

	/**
	 * using Generics and simple funtion
	 *
	 * @param inputData
	 * @return
	 */
	private static <E> boolean isPalindromeAPI(E inputData) {
		StringBuilder reverse = new StringBuilder(inputData.toString()).reverse();
		return (reverse.toString()).equals(inputData);
	}

	/**
	 * using lambda and Generics
	 *
	 * @param inputdata
	 * @return
	 */
	private static <E> boolean isPalindromeLambda(E inputdata) {
		String convertString = inputdata.toString();
		// return IntStream.range(0, convertString.length() / 2)
		// .allMatch(index -> convertString.charAt(index) == convertString
		// .charAt(convertString.length() - index - 1));
		return IntStream.range(0, convertString.length() / 2)
				.noneMatch(index -> convertString.charAt(index) != convertString
						.charAt(convertString.length() - index - 1));
	}
}
