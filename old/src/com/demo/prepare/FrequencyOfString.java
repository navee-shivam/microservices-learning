package com.demo.prepare;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FrequencyOfString {

	public static void main(String[] args) {
		List<String> enteredString = new ArrayList<>();
		enteredString.add("aaryannaa");
		enteredString.add("aayanna");
		enteredString.add("airianna");
		enteredString.add("allesandra");
		enteredString.add("allanna");
		enteredString.add("allannah");
		enteredString.add("alessandra");
		enteredString.add("allianna");
		enteredString.add("anastasia");
		enteredString.add("anastashia");
		enteredString.add("anastasia");
		enteredString.add("Annabelle");
		enteredString.add("annabelle");
		enteredString.add("annebelle");
//		System.out.println("length :" + enteredString.size());

		String checkString = "aa";

		System.out.println(frequencyReturn(enteredString, checkString));

	}

	private static List<String> frequencyReturn(List<String> enteredString,
			String checkString) {
		List<String> occuranceList = enteredString.stream()
				.filter(occurance -> occurance.startsWith(checkString))
				.collect(Collectors.toList());
		List<String> countcharacter = new ArrayList<>();
		for (String name : occuranceList) {
			countcharacter
					.add('"' + name + '"' + " - " + name.chars().distinct().count());
		}
		return countcharacter;
	}

}
