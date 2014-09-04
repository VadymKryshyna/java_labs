package com.kryshyna.java2.lab02;

/**
 * @author Kryshyna Vadym
 */

public class MyHashTable {
	private MyElement hash[]; 

	MyHashTable(int size){
		if(size < 4){	size = 10;	}
		hash = new MyElement[size];
	}

	private int hashFunction1(int key){	return key%hash.length;	}
	
	private int hashFunction2(int key){	return 4-key%3;	}
	
	public void print(){
		for (int i = 0; i < hash.length; i++){
			if(hash[i] == null){	System.out.println(i+": cell is empty");	}
			else{
				System.out.println(i+": "+hash[i].getFigure()+" (hashCode="+hash[i].getKey()+")");
			}
		}
	}
	
	public void add(MyElement element){
		int hashValue = hashFunction1(element.getKey());
		int hashStep = hashFunction2(element.getKey());
		while((hash[hashValue] != null)&&(hash[hashValue].getKey() != -1)){
			if((hashValue + hashStep)<hash.length){
				hashValue = hashValue + hashStep;
			}else{	hashValue = (hashValue + hashStep)%hash.length;	}
		}
		hash[hashValue] = element;
	}
	
	public boolean delete(double square){
		boolean result = false;
		for (int i = 0; i < hash.length; i++){
			if(hash[i] != null && hash[i].getFigure().square() < square){
				hash[i] = null;
				result = true;
			}
		}
		return result;
	}
}
