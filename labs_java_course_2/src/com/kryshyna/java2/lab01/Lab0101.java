package com.kryshyna.java2.lab01;

/**
 * @author Kryshyna Vadym
 */

public class Lab0101 {
	
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		fillStack(stack);
		stack.print();
		for (int i = 1; i < 4; i++){
			stack.delete();
		}
		stack.print();
	}

	static	void fillStack(MyStack _stack){
		boolean result = true;
		int element;
		int z = 1;
		while(result){
			element = (int)(Math.random()*100);
			z=z*-1;
			result = _stack.add(element*z);
		}
	}
}
