package com.kryshyna.java2.lab04;

/**
 * @author Kryshyna Vadym
 */

public class StudentArray {
	private Student []array;
	private int pos = 0;
	private int flagSort = 0;
	
	StudentArray(int i){
		if(i < 10){	i = 10;	}
		array = new Student[i];
	}
	
	public boolean add(Student st){	
		if(pos < array.length){
			array[pos] = st;
			pos++;
			flagSort = 0;
			return true;
		}
		return false;
	}
	
	public void print(){
		if(pos == 0){ System.out.println("Array is empty.");	}
		else{
			for(int i = 0; i < pos; i++){
				System.out.println(array[i]);
			}
		}
	}
	
	public void sort(){
		if(flagSort == 0){
			for(int i = 0; i < pos-1; i++){
				int min = i;
				for(int j = i+1; j < pos; j++){
					if (array[j].getName().compareTo(array[min].getName())<0){
						min = j;
					}
				}
				if(min != i){
					Student temp = array[i];
					array[i] = array[min];
					array[min] = temp;
				}
			}
			flagSort = 1;
			System.out.println("Array was sorted.");
		}else{
			System.out.println("Array not need sort, is sorted.");
		}
	}
	
	public void quickSort(){
		quickSortStart(array, 0, pos-1);
	}

	private void quickSortStart(Student[]arr, int le, int ri){
		if(le < ri){
			int q = Partition(array, le, ri);
			quickSortStart(array, le, q-1);
			quickSortStart(array, q+1, ri);
		}
	}

	private int Partition(Student[] arr, int p, int k) {
		Student stud = arr[k];
		Student temp;
		int i = p - 1;
		for(int j = p; j < k; j++){
			if(stud.getName().compareTo(arr[j].getName()) > 0){
				i = i + 1;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1] = arr[k];
		arr[k] = temp;
		return i + 1;
	}
	
}
