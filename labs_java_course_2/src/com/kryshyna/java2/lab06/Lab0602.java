package com.kryshyna.java2.lab06;

/**
 * @author Kryshyna Vadym
 */

public class Lab0602 {

	public static void main(String[] args) {
		System.out.println("Search start...");
		MyStatArray[] st2;
		st2 = MyStatArray.testTimeSearch(50, 5, 3);
		System.out.println("Line search");
		st2[0].printNano();
		System.out.println("Binary search");
		st2[1].printNano();

	}
}
