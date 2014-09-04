package com.kryshyna.java1.lab04;

/**
 * @author Kryshyna Vadym
 */

public class Invoice {
	private boolean accept = false;
	private double cost;

	Invoice(double _cost){
		cost = _cost;
	}
	
	public double getCost(){
		return cost;
	}
	
	public void accept(){
		accept = true;
	}
	
	public boolean isAccept(){
		return accept;
	}
}
