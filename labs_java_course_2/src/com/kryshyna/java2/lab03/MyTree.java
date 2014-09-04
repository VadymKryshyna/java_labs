package com.kryshyna.java2.lab03;

/**
 * @author Kryshyna Vadym
 */

public class MyTree {
	private MyNode root;
	
	boolean add(MyNode elem){
		if (root == null){
			root = elem;	
			return true;
		}
		else {	return ins (root, elem);	}
	}

	private boolean ins(MyNode current, MyNode element) {
		while (true){
			if (current.getStudent().getStudentID() > element.getStudent().getStudentID()){
				if (current.getLeft() == null){
					current.setLeft(element);
					break;	
				} else {
					current = current.getLeft();
				}
			}
			else if (current.getStudent().getStudentID() < element.getStudent().getStudentID()){
				if (current.getRight() == null){
					current.setRight(element);
					break;
				} else {
					current = current.getRight();
				}
			}else {
				return false;
			}
		}
		return true;
	}

	public void print(){
		if(root != null){
			printElement(root, 0);
		}else {
			System.out.println("Tree is empty.");
		}
		System.out.println("Printing is finished.");
	}

	private void printElement(MyNode current, int i) {
		if (current != null){
			printElement(current.getLeft(), ++i);
			System.out.println(i + " " + current.getStudent());
			printElement(current.getRight(), ++i);
		}
	}

	private boolean comparison(MyNode current){
	
		if((current.getStudent().getKurs() == 1)&&
				(current.getStudent().getGpa() == 5.0)&&
				(current.getStudent().getCountry() != "Ukraine")){
			return true;
		}else{
			return false;
		}
	}

	public void find(){
		if(root != null){
			findElement(root);	
		} else {
			System.out.println("Tree is empty.");
		}
	}

	private void findElement(MyNode current) {
		if (current != null){
			if(comparison(current))
			{
				System.out.println(current.getStudent());
			}
			findElement(current.getLeft());
			findElement(current.getRight());
		}
	}

	public void delete(){
		if(root != null){
			deleteElement(root);
		} else {
			System.out.println("Tree is empty.");	
		}
	}
	
	private MyNode deleteElement(MyNode current) {
		if (current != null){
			 current.setLeft(deleteElement(current.getLeft()));
			 current.setRight(deleteElement(current.getRight()));

			if(comparison(current))
			{
				if(current.getLeft() == null){
					current = current.getRight();
					return current;
				}else if(current.getRight() == null){
					current = current.getLeft();
					return current;
				}else {
					current.setRight(zam(current, current.getRight()));
				}
			}
			current.setLeft(deleteElement(current.getLeft()));
			current.setRight(deleteElement(current.getRight()));
		}
		return current;
	}
	
	private MyNode zam(MyNode dd, MyNode current) {
		if (current.getLeft() != null){
			current.setLeft(zam(dd, current.getLeft()));
		}else{
			dd.setStudent(current.getStudent());
			current = current.getRight();
		}
		return current;
	}
}
