package com.kryshyna.java2.lab03;

/**
 * @author Kryshyna Vadym
 */

public class MyNode {
	private MyStudent student;
	private MyNode left;
	private MyNode right;

	MyNode(MyStudent _student){
		student = _student;	
	}
	
	public MyStudent getStudent() {
		return student;
	}

	public void setStudent(MyStudent student) {
		this.student = student;
	}

	public MyNode getLeft() {
		return left;
	}

	public void setLeft(MyNode left) {
		this.left = left;
	}

	public MyNode getRight() {
		return right;
	}

	public void setRight(MyNode right) {
		this.right = right;
	}
}
