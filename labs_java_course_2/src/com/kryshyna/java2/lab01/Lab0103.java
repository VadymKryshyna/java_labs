package com.kryshyna.java2.lab01;

public class Lab0103 {

	public static void main(String[] args) {

		int count = 5;   //	 (int)(Math.random()*20);
		System.out.println("Stack will be have " + count + "elements.");
		
		MyList list2 = new MyList();	
		MyStack stack2 = new MyStack(count);
		
		fillStack(stack2);
		stack2.print();
		
		fillList(stack2, list2);
		stack2.print();
		list2.printHex();
		list2.printDec();
		
	}
	
	static	void fillStack(MyStack _stack){
		boolean result = true;
		int element;
		int z = 1;
		while(result){
			element = (int)(Math.random()*100);
			z=z*-1;
			result = _stack.add(element*z);
		}
	}

	static	void fillList(MyStack _stack, MyList _list){
		Integer res = _stack.delete();
		while(res!=null){
			if(res == 0){	_list.add(1);	}
			if(res > 0){	_list.add(res);	}
			else {	_list.addInEnd(-1*res);	}
			res = _stack.delete();
		}
	}
}
