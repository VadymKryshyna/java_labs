package com.kryshyna.java2.lab04;

/**
 * @author Kryshyna Vadym
 */

public class Lab0401 {

	public static void main(String[] args) {
		boolean usualy_sort = false;
		Student s1 = new Student("Mark","Twen", 1, 0);
		Student s2 = new Student("James","Bond", 3, 0);
		Student s3 = new Student("Jonn","Smith", 2, 0);
		Student s4 = new Student("Barak","Obama", 1, 0);
		Student s5 = new Student("Max","Pain", 2, 1);
		Student s6 = new Student("Adam","Scott", 2, 0);
		Student s7 = new Student("Braian","Adams", 5, 0);
		Student s8 = new Student("Ivan","Ivanov", 3, 0);
		Student s9 = new Student("Petr","Petrov", 4, 0);
		Student s10 = new Student("Niko","Nikolaev", 5, 0);
		Student s11 = new Student("Janna","Dark", 4, 1);

		StudentArray array = new StudentArray(15);
		array.print();
		array.add(s1);
		array.add(s2);
		array.add(s3);
		System.out.println("	We add 3 students");
		array.print();

		System.out.println("	Now we sort array of student");
		if (usualy_sort){	array.sort();	}else{	array.quickSort();	}
		System.out.println("	Array of student has next view");
		array.print();

		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
		array.add(s8);
		array.add(s9);
		array.add(s10);
		array.add(s11);
		System.out.println("	We add 8 new students");
		array.print();
		System.out.println("	Array is not sorting. Let's sort array");
		if (usualy_sort){	array.sort();	}else{	array.quickSort();	}
		System.out.println("	Array of student has next view");
		array.print();
	}

}
