package com.demo.prepare;

import java.util.ArrayList;
import java.util.List;

public class ListRemove {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Mango");
		l1.add("Apple");
		l1.add("Banana");
		for (String s : l1) {
			if (l1.contains(s)) {
				System.out.println(s);
			}
		}

	}

}
