package com.kryshyna.java2.lab05;

/**
 * @author Kryshyna Vadym
 */

public class NodeStudent {
	
	private Student element;
	private NodeStudent left;
	private NodeStudent right;
	
	public NodeStudent(Student st){
		element = st;
	}
	
	public Student getElement() {
		return element;
	}

	public void setElement(Student element) {
		this.element = element;
	}

	public NodeStudent getLeft() {
		return left;
	}

	public void setLeft(NodeStudent left) {
		this.left = left;
	}

	public NodeStudent getRight() {
		return right;
	}

	public void setRight(NodeStudent right) {
		this.right = right;
	}

	public int getKey(){
		return element.getGroup();
	}
	
	public Student getStudent(){
		return element;
	}
}
