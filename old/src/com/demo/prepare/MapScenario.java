package com.demo.prepare;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MapScenario {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Name", "Naveen");
		hashMap.put("Name1", "qqq");
		hashMap.put("Name2", "www");
		hashMap.put("Name3", "eee");
		hashMap.put("Name4", "rrr");
		hashMap.put("Name5", "ttt");
		hashMap.put("Name6", "Naveen");
		hashMap.put("Name7", "Naveen");

		method(hashMap);
	}

	private static void method(HashMap<String, String> hashMap) {
		System.out.println("KeySet : " + hashMap.keySet());
		System.out.println("EntrySet : " + hashMap.entrySet());
		System.out.println("Get Values :" + hashMap.values());

		Collection<String> values = hashMap.values();
		

		System.out.println(hashMap.values().stream().collect(Collectors.toSet()));

	}

}
