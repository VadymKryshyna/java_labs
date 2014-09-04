package com.kryshyna.java2.lab02;

/**
 * @author Kryshyna Vadym
 */

public class MyElement {
	private MyTrapezium figure;
	
	MyElement(MyTrapezium _figure){
		figure = _figure;
	}
	
	public int getKey() {
		return (int)figure.perimetr();
	}
	
	public MyTrapezium getFigure(){
		return figure;
	}
}
