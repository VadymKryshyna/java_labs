package com.kryshyna.java2.lab01;

/**
 * @author Kryshyna Vadym
 */

public class MyStack {
	private int mas[];
	private int top;
	
	MyStack(int count){
		mas = new int[count];
		top = -1;
	}
	
	boolean add(int elem){
		if (top == mas.length-1){
			System.out.println("Can't add element  " + elem + ". Stack is full.");
			return false;
		}else{
			mas[++top] = elem;
			System.out.println("You add element: " + elem + ". His position is " + (top+1));
			return true;
		}
	}
	
	Integer delete(){
		if(top < 0){
			System.out.println("Can't delete element. Stack is empty.");
			return null;
		}
		else{
			int result = mas[top];
			mas[top--] = 0;
			System.out.println("You delete element: " + result + ". His position was " + (top+2));
			return result;
		}
	}
	void print(){
		if (top < 0){
			System.out.println("Stack is empty");
		}
		else{
			System.out.println("Stack has next elements:");
			for(int i = top; i > -1; i--){
				System.out.print((i+1) + "=" + mas[i] + "; ");
			}
			System.out.println();
		}
	}
}
