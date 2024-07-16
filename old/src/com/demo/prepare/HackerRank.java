package com.demo.prepare;

import java.io.IOException;
import java.util.Scanner;

/**
 * Given an integer, , perform the following conditional actions:
 *
 * If n is odd, print Weird If n is even and in the inclusive range of 6 to 20
 * print Weird
 *
 * If n is even and in the inclusive range of 2 to 5 and greater than 20, print
 * Not Weird Complete the stub code provided in your editor to print whether or
 * not is weird.
 *
 * @author navee
 *
 */
public class HackerRank {
	public static void main(String[] args) throws IOException {
		oddNumbers();
	}

	public static void oddNumbers() {
		Scanner scan = new Scanner(System.in);
		int integer = scan.nextInt();
		Scanner doub = new Scanner(System.in);
		double decimal = doub.nextDouble();
		Scanner scan2 = new Scanner(System.in);
		String text = scan2.nextLine();

		System.out.println("String: " + text);
		System.out.println("Double: " + decimal);
		System.out.println("Int: " + integer);
	}
}
