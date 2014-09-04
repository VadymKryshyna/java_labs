package com.kryshyna.java2.lab05;

/**
 * @author Kryshyna Vadym
 */

public class StudentArray {
	
	private Student []array;
	private int pos = 0;
	
	StudentArray(int i){
		if(i < 10){	i = 10;	}
		array = new Student[i];
	}
	
	public void print(){
		if(pos == 0){ System.out.println("Array is empty.");	}
		else{
			for(int i = 0; i < array.length; i++){
				System.out.println(array[i]);
			}
		}
	}
	
	public boolean fillArray(){
		int borderM = 0;
		int borderW = this.array.length-1;
		for (int k = 0; k < this.array.length; k++){
			Student st = Student.createStudent(k);
			if (st.getSexInt()==1){
				this.array[borderM] = st;
				borderM++;
				for(int i = 0; i < borderM; i++){
					int max = i;
					for(int j = i+1; j < borderM; j++){
						if (array[j].getStudID() < array[max].getStudID()){
							max = j;
						}
					}
					if(max != i){
						Student temp = array[i];
						array[i] = array[max];
						array[max] = temp;
					}
				}
			}
			else{
				this.array[borderW] = st;
				borderW--;
				for(int i = this.array.length-1; i > borderW; i--){
					int min = i;
					for(int j = i; j > borderW; j--){
						if (array[j].getStudID() > array[min].getStudID()){
							min = j;
						}
					}
					if(min != i){
						Student temp = array[i];
						array[i] = array[min];
						array[min] = temp;
					}
				}
			}
		}
		pos = borderM;
		return true;
	}
	
	public Student binarySearch(int numID, int sex){
		Student result = null;
		if(pos != 0){
			if (sex==1){
				if(pos != 0){	result = binarySearchElement(0, pos-1, numID);	}
			}else{
				if(pos!=array.length){	result = binarySearchElement(pos, array.length-1, numID);	}
			}
		}
		return result;
	}
	
	private Student binarySearchElement(int le, int ri, int numID) {
		if (le > ri) {	return null;	}
		int m = (ri+le)/2;
		if (numID == this.array[m].getStudID()){	return this.array[m];	}
		if (le == ri){	return null;	}
		if (numID <this.array[m].getStudID()){	return binarySearchElement(le, m-1, numID);	}	
		else{	return binarySearchElement(m+1, ri, numID);	}
	}
}
