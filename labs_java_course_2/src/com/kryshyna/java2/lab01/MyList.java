package com.kryshyna.java2.lab01;

/**
 * @author Kryshyna Vadym
 */

public class MyList {

	MyElement head;
	int count;
	
	MyList(){
		count = 0;
		head = null;
	}
	
	boolean add(int _data){
		if(_data > 0){
			head = new MyElement(Integer.toHexString(_data), head);
			count++;
			System.out.println("You add element: 0x" + head.data + ". His position is " + count);
			return true;
		} else{
			System.out.println("Can't add a negative/less zero element");
			return false;
		}	
	}
	
	boolean addInEnd(int _data){
		if (head == null) {
			return add(_data);
		}
		if(_data > 0){
			MyElement current = head;
			while (current.prev != null){
				current = current.prev;
			}
			current.prev = new MyElement(Integer.toHexString(_data), current.prev);
			count++;
			System.out.println("You add element: " + current.prev.data + ". His position is " + 1);
			return true;
		} else{
			System.out.println("Can't add a negative/less zero element");
			return false;
		}	
	}
	
	MyElement delete(){
		if(isEmpty()){
			return null;
		}
		else{
			MyElement result = head;
			head = head.prev;
			System.out.println("You delete element: " + result.data + ". His position was " + count);
			count--;
			return result;
		}
	}

	MyElement deleteByNumber(int _number){
		MyElement result;
		int currentCount = count;
		MyElement current = head;
		if(isEmpty()){
			return null;
		}else	if(_number > count){
			System.out.println("Can't delete element. This element not exist.");
			return null;
		}else	if(_number == 1){
			if(count ==1){
				result = head;
				head = head.prev;
			}
			else{
				while (current.prev.prev != null){
					current = current.prev;
					currentCount--;
				}
				result = current.prev;
				current.prev = current.prev.prev;
			}
		}
		else{
			while (currentCount != _number){
				current = current.prev;
				currentCount--;
			}
			result = current;
			current.data = current.prev.data;
			current.prev = current.prev.prev;
			System.out.println("You delete element: " + result.data + ". His position was " + currentCount);
			count--;
			return result;
		}
		return null;
	}
		
	boolean isEmpty(){
		if (head == null){
			System.out.println("Can't delete element. List is empty.");
		}
		return (head == null);
	}
	
	void printHex(){
		if (head == null){
			System.out.println("List is empty");
		}
		else{
			MyElement current = head;
			System.out.println("List has next " + count + " elements:");
			int currentCount = count;
			while (current!= null){
				System.out.print(currentCount + "el.=0x" + current.data + "; ");
				current = current.prev;
				currentCount--;
			}
		System.out.println();
		}
	}
	
	void printDec(){
		if (head == null){
			System.out.println("List is empty");
		}
		else{
			MyElement current = head;
			System.out.println("List has next " + count + " elements:");
			int currentCount = count;
			while (current!= null){
				int res = Integer.parseInt(current.data, 16);
				System.out.print(currentCount + "el.=" + res + "; ");
				current = current.prev;
				currentCount--;
			}
		System.out.println();
		}
	}
}
