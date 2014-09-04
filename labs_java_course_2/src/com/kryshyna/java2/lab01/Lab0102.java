package com.kryshyna.java2.lab01;

/**
 * @author Kryshyna Vadym
 */

public class Lab0102 {

	public static void main(String[] args) {
		MyList list = new MyList();
		list.printHex();
		for (int i = 9; i < 16; i++){
			list.add(i);
		}
		list.printHex();
		for (int i = 0; i < 2; i++){
			list.delete();
		}
		list.printHex();
		list.deleteByNumber(6);
		list.printHex();
		list.printDec();
	}
}
