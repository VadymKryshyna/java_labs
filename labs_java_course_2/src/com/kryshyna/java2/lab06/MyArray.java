package com.kryshyna.java2.lab06;

import java.util.Random;

/**
 * @author Kryshyna Vadym
 */

public class MyArray {
	private int[] array;
	
	public MyArray(int arr){
		array = new int[arr];
	}
	
	public void fillArray(){
		for (int i = 0; i < array.length; i++){
			Random rand = new Random();
			array[i] = rand.nextInt(array.length);
		}
	}
	
	public void bubbleSort(){
	    for(int i = 0; i < array.length; i++){
	        for(int j = array.length-1; j > i ; j--){
	            if( array[j] > array[j-1] ){
	    		    swap(j, j-1);
			    }
	        }
	    }
	}

	private void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

	public int lineSearch(int elem){
		for(int i = 0; i < array.length; i++){
			if(array[i]==elem){	return i;	}
		}
		return 0;
	}
	
	public int binarySearch(int elem){
		return binarySearchElem (0, array.length-1, elem);
	}
	
	private int binarySearchElem(int le, int ri, int elem) {
		if (le > ri){	return 0;	}
		int m = (ri+le)/2;
		if (elem == array[m]){	return m;	}
		if (le == ri){	return 0;	}
		if (elem < array[m]){	return binarySearchElem(le, m-1, elem);	}
		else{	return binarySearchElem(m+1, ri, elem);	}
	}
	
	public void print(){
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
