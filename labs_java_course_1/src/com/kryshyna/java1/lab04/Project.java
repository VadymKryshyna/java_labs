package com.kryshyna.java1.lab04;

/**
 * @author Kryshyna Vadym
 */

public class Project {
	private Person myBrigade[];

	public Project(Person _myBrigade[]){
		myBrigade = _myBrigade;
		System.out.println("Make new project, count person in brigada = " + _myBrigade.length);
	}
	
	public Person[] getMyBrigade(){
		return myBrigade;
	}
	
}
