package com.demo.prepare;

import java.util.ArrayList;
import java.util.List;

//class AirPlane {
//	public AirPlane() throws IOException {
//		System.out.print("AirPlane");
//		throw new IOException();
//	}
//}
//
//class AirJet extends AirPlane {
//	public AirJet() throws IOException {
//		System.out.println("Airjet");
//		try {
//			super();
//		} catch (IOException e) {
//			System.out.print("IOException is thrown in AirJet");
//		}
//	}
//}

public class pramatitech {
	public static void main(String[] args) {
		// int[] array = { 1, 2, 3, 4, 5, 6, 9, 12, 10, 11 };
		// int[] array = {1, 2, 3, 4, 5};
		// int[] array = { 4, 1, 3, 2 };
		List<Integer> array = new ArrayList<Integer>();
		array.add(4);
		array.add(1);
		array.add(3);
		array.add(2);
		int pairWithMaxDiff = findPairWithMaxDiff(array);
		System.out.printf("Max diff is %d ", pairWithMaxDiff);

		// String[] votes = { "a", "b", "c", "b", "d", "a", "b", "c", "c" };
		// List<String> voteList = Arrays.asList(votes);
		// Map<String, Long> voteCountMap = voteList.stream()
		// .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		// Long max = voteCountMap.values().stream()
		// .max(Comparator.comparing(Long::longValue)).get();
		// Map<String, Long> maxVotesMap = voteCountMap.entrySet().stream()
		// .filter(e -> e.getValue() == max)
		// .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		// List<String> maxVotedMembers = maxVotesMap.keySet().stream()
		// .collect(java.util.stream.Collectors.toList());
		// Collections.sort(maxVotedMembers);
		// System.out.println(maxVotedMembers.get(maxVotedMembers.size() - 1));
	}

	private static int findPairWithMaxDiff(List<Integer> arrayListValue) {
		int difference = 0;
		int[] maximumDiff = new int[2];
		for (int iIndex = 0; iIndex < (arrayListValue.size() - 1); iIndex++) {
			for (int jIndex = iIndex + 1; jIndex < arrayListValue.size(); jIndex++) {
				if (arrayListValue.get(iIndex) < arrayListValue.get(jIndex)
						&& (arrayListValue.get(jIndex)
								- arrayListValue.get(iIndex)) > difference) {
					difference = arrayListValue.get(jIndex) - arrayListValue.get(iIndex);
					maximumDiff[0] = arrayListValue.get(iIndex);
					maximumDiff[1] = arrayListValue.get(jIndex);
				}
			}
		}
		return maximumDiff[1] - maximumDiff[0];
	}
}
