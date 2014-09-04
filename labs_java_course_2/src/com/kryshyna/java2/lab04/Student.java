package com.kryshyna.java2.lab04;

/**
 * @author Kryshyna Vadym
 */

public class Student {
	private String name;
	private String surname;
	private int groupe;
	private String sex;
	
	Student (String _name, String _surname, int _groupe, int _s){
		name = _name;
		surname = _surname;
		groupe = _groupe;
		if(_s == 0){	sex = "male";	}
		else{	sex = "female";	}
	}
	
	@Override
	public String toString(){
		return name + " " + surname + " " + "groupe " + groupe + " " + sex;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getGroupe() {
		return groupe;
	}

	public String getSex() {
		return sex;
	}
}
