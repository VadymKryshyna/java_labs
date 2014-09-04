package com.kryshyna.java2.lab04;

/**
 * @author Kryshyna Vadym
 */

public class Lab0402 {

	public static void main(String[] args) {
		Student s1 = new Student("Mark","Twen", 2, 0);
		Student s2 = new Student("James","Bond", 3, 0);
		Student s3 = new Student("Jonn","Smith", 2, 0);
		Student s4 = new Student("Barak","Obama", 2, 0);
		Student s5 = new Student("Max","Pain", 2, 1);
		Student s6 = new Student("Will","Shekspir", 2, 0);


		StudentList list = new StudentList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.print();
		list.sort();
		list.print();

	}

}
