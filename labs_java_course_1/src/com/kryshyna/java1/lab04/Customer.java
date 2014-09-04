package com.kryshyna.java1.lab04;

/**
 * @author Kryshyna Vadym
 */

public class Customer {
	private Task myTask;

	Customer(){
		System.out.println("Make customer");
	}

	public void makeTask(int numberOfFloors){
		myTask = new Task(numberOfFloors, this);
	}
	
	public Task getTask(){
		return myTask;
	}
	
	public void acceptInvoice(Invoice invoice){	
		if (invoice.getCost() < 100.0){	invoice.accept();	}
	}
}
