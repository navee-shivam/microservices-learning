package com.demo.prepare;

public class WalmartPrepare {

//	public static void main(String[] args) {
//		// System.out.println("firstOccurance :" +
//		// getFirstOccuranceCharacter("eevane"));
//		// System.out.println("reverse :" + reverse("The name is naveen"));
//		System.out.println(getPalindrome(
//				"This is Naveen im a anna,hi.bye/heshe?15+add;to;from;121/90090090"));
//	}
//
//	/**
//	 *
//	 * @param a
//	 * @return
//	 */
//	private static boolean isNotNull(char a) {
//		if (a == CharUtils.NUL)
//			return false;
//		return true;
//	}
//
//	/**
//	 *
//	 * @param input
//	 * @return
//	 */
//	private static char getFirstOccuranceCharacter(String input) {
//		Map<Character, Integer> charcterMap = new LinkedHashMap<>();
//		char[] charcterArray = input.toCharArray();
//		for (char individual : charcterArray) {
//			charcterMap.put(individual, charcterMap.containsKey(individual)
//					? charcterMap.get(individual) + 1 : 1);
//		}
//		for (Entry<Character, Integer> entrySet : charcterMap.entrySet()) {
//			if (entrySet.getValue() == 1) {
//				return entrySet.getKey();
//			}
//		}
//		return CharUtils.NUL;
//	}
//
//	/**
//	 *
//	 * @param input
//	 * @return
//	 */
//	private static String reverse(String input) {
//		if (isEmpty(input)) {
//			String reverseString = StringUtils.EMPTY;
//			for (int index = input.length(); index > 0; index--) {
//				reverseString = reverseString + input.charAt(index - 1);
//			}
//			return reverseString;
//		}
//		return StringUtils.EMPTY;
//	}
//
//	/**
//	 *
//	 * @param input
//	 * @return
//	 */
//	private static boolean isEmpty(String input) {
//		if (input.length() == -1)
//			return false;
//		return true;
//	}
//
//	private static List<String> getPalindrome(String inputData) {
//		String[] words = inputData.split("(\\s|\\p{Punct})+");
//		List<String> palindromeList = new LinkedList<>();
//		for (String word : words) {
//			StringBuilder str = new StringBuilder(word).reverse();
//			System.out.println("reverse : " + str);
//			if ((str.toString()).equals(word)) {
//				palindromeList.add(word);
//			}
//		}
//		return palindromeList;
//	}
//
//	//Need to code
//	private static String getLongestPalindrome(String inputData){
//		List<String> palindromeList = getPalindrome(inputData);
//		for(String word:palindromeList){
//
//		}
//		return null;
//
//	}
//
//	//Need to code
//	private static String doDeleteCharacter(String inputString,char characterDelete){
//		//if(characterDelete)
//
//		return null;
//
//	}
}