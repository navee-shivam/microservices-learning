package com.demo.prepare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingLearnComparator {

	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(050);
		listInteger.add(020);
		listInteger.add(850);
		listInteger.add(320);
		listInteger.add(110);

		Collections.sort(listInteger, (o1, o2) -> {
			return o1 < o2 ? 1 : -1;
		});

		// listInteger.stream().forEach(System.out::println);

		doObjectComparator();

	}

	private static void doObjectComparator() {
		List<DataClass> DC1 = new ArrayList<>();
		DC1.add(new DataClass(20000, "Navee"));
		DC1.add(new DataClass(30000, "Mathi"));
		DC1.add(new DataClass(30000, "Geetha"));
		DC1.add(new DataClass(40000, "Moni"));
		DC1.add(new DataClass(40000, "Kumar"));
		DC1.add(new DataClass(25000, "Shivam"));
		DC1.add(new DataClass(10000, "Ramya"));
		DC1.add(new DataClass(10000, "Saran"));

		Comparator<DataClass> comp = Comparator.comparing(DataClass::getSalary).reversed()
				.thenComparing(DataClass::getName).reversed();

		// Collections.sort(DC1, (s1, s2) -> {
		// return s1.salary < s2.salary ? 1 : -1;
		// });

		Collections.sort(DC1, comp);

		for (DataClass dc : DC1) {
			System.out.println(dc.toString());
		}

	}
}

class DataClass {
	public int salary;
	public String name;

	public DataClass(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "DataClass [salary=" + salary + ", name=" + name + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
