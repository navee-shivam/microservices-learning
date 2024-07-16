package com.demo.prepare;

import java.util.ArrayList;
import java.util.List;

public class OddEvenMaxScore {

	public static void main(String[] args) {
		List<Integer> arryList = new ArrayList<>();
		arryList.add(1);
		arryList.add(2);
		arryList.add(3);
		arryList.add(4);
		arryList.add(2);
		arryList.add(6);
		System.out.println("FINAL RESULT :" + getMaxScore(arryList));

	}

	private static long getMaxScore(List<Integer> arrayList) {
		List<Integer> duplicateList = arrayList;
		int n = arrayList.size();
		long maxScore = sumList(arrayList), sum = 0;

		for (int index = 1; index <= n; index++) {
			if (index % 2 != 0) {
				maxScore += sum;
			} else {
				maxScore -= sum;
			}
			if ((n / 2) + 1 == index) {
				duplicateList.remove(1);
			} else {
				duplicateList.remove(n - index);
			}
			sum = sumList(duplicateList);
			System.out.println("SUMLIST : " + sumList(arrayList));
		}
		return maxScore;
	}

	private static long sumList(List<Integer> arrayList) {
		long sum = 0;
		for (int arrayNumber : arrayList) {
			sum += arrayNumber;
		}
		return sum;
	}

}
