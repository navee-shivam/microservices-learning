package com.demo.prepare;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface inter {
	void show();

	default void display() {
		System.out.println("hai");
	}
}

public class LearnLambda {

	public static void main(String[] args) {

		Consumer<Integer> cons = (i) -> System.out.println(i + "delo");

		inter ab;
		ab = () -> System.out.println("haoi");
		ab.show();
		List<Integer> integer = Arrays.asList(1, 2, 3, 4, 5, 6, 0);
		// integer.forEach(System.out::println); // method ref

//		integer.forEach(LearnLambda::doubleReturn);
//		ab.display();

		Stream<Integer> stream = integer.stream();
		stream.forEach(System.out::println);

		stream.forEach(System.out::println);

	}

	public static void doubleReturn(int i) {
		System.out.println(i * 2);
	}

}
