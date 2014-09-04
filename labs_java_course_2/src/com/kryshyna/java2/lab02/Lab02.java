package com.kryshyna.java2.lab02;

/**
 * @author Kryshyna Vadym
 */

public class Lab02 {

	public static void main(String[] args) {
		int arr[][] = new int[][] {
			{0,0,0,1,1,1,1,0},
			{0,1,1,2,2,1,1,0},
			{0,1,0,3,1,2,1,0},
			{0,1,1,2,3,0,2,0}};

		int size = 9;
	
		MyHashTable myHashTable = new MyHashTable(size);

		
		for (int j = 0; j <4; j++){
			if(MyTrapezium.isTrapezium(arr[j][0], arr[j][1], arr[j][2], arr[j][3], arr[j][4], arr[j][5], arr[j][6], arr[j][7])){
				myHashTable.add(new MyElement(new MyTrapezium(arr[j][0], arr[j][1], arr[j][2], arr[j][3], arr[j][4], arr[j][5], arr[j][6], arr[j][7])));
			}
		}
		
		myHashTable.print();
		System.out.println("Now will delete element with square = 2.0000000000000005");
		myHashTable.delete(2.1);
		
		myHashTable.print();
	}
}
