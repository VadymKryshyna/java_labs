package com.kryshyna.java2.lab05;

/**
 * @author Kryshyna Vadym
 */

public class Lab0502 {

	public static void main(String[] args) {
			System.out.println("Create tree");
			BSTreeStudent tree = new BSTreeStudent();
			for (int i = 0; i < 30; i++){
				Student st = Student.createStudent(i);
				tree.insert(st);
			}
			System.out.println("Fill up tree");
			System.out.println("Printing tree");
			tree.print();
			System.out.println("Search array of student for group=5");
			Student [] ar = tree.searchArray(5);
			for (int i = 0; i < ar.length; i++){
				System.out.println((i+1)+ ": " + ar[i].toString());
			}
			Student el = tree.search(5);
			System.out.println("Search first element student for group=5");
			System.out.println(el.toString());
	}
}
