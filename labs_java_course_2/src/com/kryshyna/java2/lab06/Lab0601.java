package com.kryshyna.java2.lab06;

/**
 * @author Kryshyna Vadym
 */

public class Lab0601 {

	public static void main(String[] args) {
		System.out.println("Sort start...");
		MyStatArray st1;
		st1 = MyStatArray.testTimeSortBubble1(30, 1, 3);
		System.out.println("Bubble sort");
		st1.print();

	}

}
