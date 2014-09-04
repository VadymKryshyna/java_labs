package com.kryshyna.java2.lab05;

/**
 * @author Kryshyna Vadym
 */

public class Lab0501 {
	public static void main(String[] args) {
		StudentArray st = new StudentArray(20);
		st.print();
		System.out.println("fill");
		st.fillArray();
		st.print();

		System.out.println("search");
		Student s1, s2;
		s1 = st.binarySearch(10, 1);
		System.out.println(s1);
		s2 = st.binarySearch(10, 2);
		System.out.println(s2);
	}
}
