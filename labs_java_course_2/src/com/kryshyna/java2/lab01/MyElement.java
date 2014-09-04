package com.kryshyna.java2.lab01;

/**
 * @author Kryshyna Vadym
 */

public class MyElement {
	
	String data;
	MyElement prev;

	MyElement(String _data, MyElement _prev){
		data = _data;
		prev = _prev;
	}
}
