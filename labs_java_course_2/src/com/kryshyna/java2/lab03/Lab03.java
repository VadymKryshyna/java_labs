package com.kryshyna.java2.lab03;

/**
 * @author Kryshyna Vadym
 */

public class Lab03 {

	public static void main(String[] args) {
		MyStudent s1 = new MyStudent("Ivanov", 1, 100, 5.0, "USA");
		MyStudent s2 = new MyStudent("Petrov", 1, 50, 5.0, "USA");
		MyStudent s3 = new MyStudent("Sidorov", 2, 200, 5.0, "Canada");
		MyStudent s4 = new MyStudent("Andreev", 4, 20, 5.0, "Canada");
		MyStudent s5 = new MyStudent("Bond", 3, 80, 3.0, "USA");
		MyStudent s6 = new MyStudent("Smith", 2, 150, 4.2, "Germany");
		MyStudent s7 = new MyStudent("Nikolaev", 1, 300, 5.0, "Poland");
		MyStudent s8 = new MyStudent("Nikolaev", 1, 60, 5.0, "Poland");

		MyTree tree = new MyTree();
		System.out.println("		Program starts");
		tree.print();
		tree.add(new MyNode(s1));
		tree.add(new MyNode(s2));
		tree.add(new MyNode(s3));
		tree.add(new MyNode(s4));
		tree.add(new MyNode(s5));
		tree.add(new MyNode(s6));
		tree.add(new MyNode(s7));
		tree.add(new MyNode(s8));
		
		System.out.println("		After adding");
		tree.print();
		System.out.println("		Search elements");
		tree.find();
		System.out.println("		After delete");
		tree.delete();
		tree.print();
		System.out.println("		The end.");

		
	}

}
