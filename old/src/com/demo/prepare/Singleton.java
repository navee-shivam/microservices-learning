package com.demo.prepare;

/**
 * Only one object can be created for the class
 * Singleton design pattern
 * @author navee
 *
 */
public class Singleton {
	public String str;

	private Singleton() {
	}

	public static Singleton getSingleInstance() {
		return new Singleton();
	}
}
