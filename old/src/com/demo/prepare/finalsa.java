package com.demo.prepare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;

abstract interface IManupulation { // Interface declaration
	void add();// method declaration

	abstract void subtract();
}

class Manipulation { // Super class

	void add() {// No Parameter
		System.out.println("base");
	}

	void add(int a) { // integer parameter
		System.out.println("overload" + a);
	}
}

public class finalsa extends Manipulation {

	public void add() {
		System.out.println("base");
	}

	void add(int a) { // integer parameter
		System.out.println("overload base" + a);
	}

	public static void main(String args[]) {
		StringJoiner sj = new StringJoiner(",", "{", "}");
		sj.add("a0");
		sj.add("sd");
		System.out.println(sj);
		Manipulation a = new finalsa();
		a.add(1);
		List<List<String>> originalList = new ArrayList<>();
		List<String> singlelist = new ArrayList<>();
		singlelist.add("owjevtkuyv");
		singlelist.add("58584272");
		singlelist.add("62930912");
		originalList.add(singlelist);
		singlelist = new ArrayList<>();
		singlelist.add("rpaqgbjxik");
		singlelist.add("9425650");
		singlelist.add("96088250");
		originalList.add(singlelist);
		singlelist = new ArrayList<>();
		singlelist.add("dfbkasyqcn");
		singlelist.add("37469674");
		singlelist.add("46363902");
		originalList.add(singlelist);
		singlelist = new ArrayList<>();
		singlelist.add("vjrrisdfxe");
		singlelist.add("18666489");
		singlelist.add("88046739");
		originalList.add(singlelist);
		System.out.println(originalList);
		List<String> result = fetchItemsToDisplay(originalList, 1, 1, 2, 1);
		System.out.println(result);
	}

	/*
	 * Complete the 'fetchItemsToDisplay' function below.
	 *
	 * The function is expected to return a STRING_ARRAY. The function accepts
	 * following parameters: 1. 2D_STRING_ARRAY items 2. INTEGER sortParameter 3.
	 * INTEGER sortOrder 4. INTEGER itemsPerPage 5. INTEGER pageNumber
	 */

	public static List<String> fetchItemsToDisplay(List<List<String>> items,
			int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {
		// Write your code here
		Comparator<List<String>> nameComp = (n1, n2) -> {
			return n1.get(0).compareTo(n2.get(0));
		};
		Comparator<List<String>> relevanceComp = (List<String> r1,
				List<String> r2) -> {
			int valueOne = Integer.valueOf(r1.get(1));
			int valueTwo = Integer.valueOf(r2.get(1));
			if (valueOne == valueTwo) {
				return 0;
			} else {
				return Integer.compare(valueOne, valueTwo);
			}
		};
		Comparator<List<String>> priceComp = (List<String> r1, List<String> r2) -> {
			int valueOne = Integer.valueOf(r1.get(2));
			int valueTwo = Integer.valueOf(r2.get(2));
			if (valueOne == valueTwo) {
				return 0;
			} else {
				return Integer.compare(valueOne, valueTwo);
			}
		};
		if (sortOrder == 0) {
			if (sortParameter == 0) {
				Collections.sort(items, nameComp);
			} else if (sortParameter == 1) {
				Collections.sort(items, relevanceComp);
			} else {
				Collections.sort(items, priceComp);
			}
		} else {
			if (sortParameter == 0) {
				Collections.sort(items, nameComp.reversed());
			} else if (sortParameter == 1) {
				Collections.sort(items, relevanceComp.reversed());
			} else {
				Collections.sort(items, priceComp.reversed());
			}
		}
		List<String> resultList1 = new ArrayList<>();
		items.stream().skip(itemsPerPage * pageNumber).limit(itemsPerPage)
				.forEach((x) -> resultList1.add(x.get(0)));
		return resultList1;
	}

}