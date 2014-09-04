package com.kryshyna.java2.lab04;

/**
 * @author Kryshyna Vadym
 */

public class StudentList {
	private StudentElement head;
	
	StudentList(){
		head = null;
	}
	
	boolean add(Student st){
		head = new StudentElement(st, head);
		return true;
	}
	
	public void print(){
		if(head == null){ System.out.println("List is empty.");	}
		else{
			StudentElement temp = head;
			while(temp!=null){
				System.out.println(temp.getStudent());
				temp = temp.getPrev();
			}
		}
		System.out.println("Print finished");
	}
	
	public 	StudentElement deleteTop(StudentElement studentElement){
		
		if(head == null){
			return null;
		}
		else{
			StudentElement result = head;
			head = head.getPrev();
		return result;
		}
	}
	
	public StudentElement maxElement(StudentElement currentElem){
		StudentElement maxElem = currentElem;
		while((currentElem = currentElem.getPrev()) != null){
			if(currentElem.getStudent().getName().compareTo(maxElem.getStudent().getName())<0){
				maxElem = currentElem;
			}
		}
		return maxElem;
	}

	void swapElement(StudentElement stEl1, StudentElement stEl2){
		Student temp = stEl1.getStudent();
		stEl1.setStudent(stEl2.getStudent());
		stEl2.setStudent(temp);
	}
	
	public void sort(){
		StudentElement current = head;
		StudentElement maxElem;
		while(current.getPrev()!=null){
			if ((maxElem = maxElement(current)) != current){
				swapElement(current, maxElem);
			}
			current = current.getPrev();
		}
	}
}
