package com.kryshyna.java1.lab04;

/**
 * @author Kryshyna Vadym
 */

public class Task {
	private int numberOfFloors;
	private Customer myCustomer;

	Task(int _numberOfFloors, Customer _myCustomer){
		numberOfFloors = _numberOfFloors;
		myCustomer = _myCustomer;
	}
	
	public int getNumberOfFloors(){
		return numberOfFloors;
	}
	
	public Customer getCustomer(){
		return myCustomer;
	}
	
}
