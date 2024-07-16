package com.demo.prepare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorComparable {
	public static void main(String[] args) {
		ArrayList<Employees> employees = getUnsortedEmployeeList();

		// Compare by first name and then last name
		Comparator<Employees> compareByName = Comparator
				.comparing(Employees::getFirstName)
				.thenComparing(Employees::getLastName);

		List<Employees> sortedEmployees = employees.stream().sorted(compareByName)
				.collect(Collectors.toList());

		System.out.println(sortedEmployees);
	}

	private static ArrayList<Employees> getUnsortedEmployeeList() {
		ArrayList<Employees> list = new ArrayList<>();
		list.add(new Employees(2l, "Lokesh", "Gupta"));
		list.add(new Employees(1l, "Alex", "Gussin"));
		list.add(new Employees(4l, "Brian", "Sux"));
		list.add(new Employees(5l, "Neon", "Piper"));
		list.add(new Employees(3l, "David", "Beckham"));
		list.add(new Employees(7l, "Alex", "Beckham"));
		list.add(new Employees(6l, "Brian", "Suxena"));
		return list;
	}
}

class Employees {
	private long id;
	private String firstName;
	private String lastName;

	public Employees(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}

}