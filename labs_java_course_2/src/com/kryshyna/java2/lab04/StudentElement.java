package com.kryshyna.java2.lab04;

/**
 * @author Kryshyna Vadym
 */

public class StudentElement {
	private Student student;
	private StudentElement prev;
	
	StudentElement(Student _student, StudentElement _current){
		student = _student;
		prev = _current;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public StudentElement getPrev() {
		return prev;
	}
	
}
