package com.demo.prepare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaginationProblem {

	private static List<List<String>> listValues() {
		List<List<String>> listStr = new ArrayList<List<String>>();
		List<String> l2 = new ArrayList<String>();
		l2.add("Wood");
		l2.add("25000");
		l2.add("5");
		listStr.add(l2);
		List<String> l3 = new ArrayList<String>();
		l3.add("Paper");
		l3.add("12000");
		l3.add("2");
		listStr.add(l3);
		List<String> l4 = new ArrayList<String>();
		l4.add("Machine");
		l4.add("10000");
		l4.add("25");
		listStr.add(l4);

		List<String> l5 = new ArrayList<String>();
		l5.add("Cutter");
		l5.add("55000");
		l5.add("1");
		listStr.add(l5);
		List<String> l6 = new ArrayList<String>();
		l6.add("Lorry");
		l6.add("22000");
		l6.add("10");
		listStr.add(l6);
		List<String> l7 = new ArrayList<String>();
		l7.add("Container");
		l7.add("8000");
		l7.add("21");
		listStr.add(l7);
		List<String> l8 = new ArrayList<String>();
		l8.add("Screw");
		l8.add("18000");
		l8.add("3");
		listStr.add(l8);
		List<String> l9 = new ArrayList<String>();
		l9.add("Bolt");
		l9.add("200");
		l9.add("1");
		listStr.add(l9);
		List<String> l10 = new ArrayList<String>();
		l10.add("Train");
		l10.add("80000");
		l10.add("29");
		listStr.add(l10);
		List<String> l11 = new ArrayList<String>();
		l11.add("Car");
		l11.add("80200");
		l11.add("7");
		listStr.add(l11);

		return listStr;
	}

	/**
	 * stringReturn
	 *
	 * @param listStr
	 * @param sortParameter-0-items,1-price,2-quantity,
	 * @param sortOrder                                 - 0-ASC,1-DESC
	 * @param itemsPerPage-no                           of items per page
	 * @param pageNumber-                               display page number
	 * @return
	 */
	private static List<String> stringReturn(List<List<String>> listStr, int sortParameter, int sortOrder,
			int itemsPerPage, int pageNumber) {
		List<String> displayItems = new ArrayList<>();
		Comparator<String> sortString = (n1, n2) -> {
			return n1.compareTo(n2);
		};

		Comparator<String> sortInteger = (n1, n2) -> {
			return Integer.compare(Integer.valueOf(n1), Integer.valueOf(n2));
		};
		System.out.println(listStr);
		Map<String, String> map = new HashMap<>();
		for (List<String> lists : listStr) {
			map.put(lists.get(sortParameter), lists.get(0));
			displayItems.add(lists.get(sortParameter));
		}
		System.out.println(map);
		if (sortOrder == 0) {
			if (sortParameter == 0) {
				Collections.sort(displayItems, sortString);
			} else {
				Collections.sort(displayItems, sortInteger);
			}
		} else {
			if (sortParameter == 0) {
				Collections.sort(displayItems, sortString.reversed());
			} else {
				Collections.sort(displayItems, sortInteger.reversed());
			}

		}
		System.out.println("sorted order Items : " + displayItems);
		List<String> returnItems = new ArrayList<>();
		if (pageNumber == 0)
			pageNumber = 1;
		displayItems.stream().skip(itemsPerPage * (pageNumber - 1)).limit(itemsPerPage)
				.forEach(x -> returnItems.add(x));

		List<String> endResult = new ArrayList<>();
		for (String itemSorted : returnItems) {
			endResult.add(map.get(itemSorted));
		}

		return endResult;
	}

	public static void main(String[] args) {
		System.out.println(stringReturn(listValues(), 1, 1, 1, 1));

	}

}
