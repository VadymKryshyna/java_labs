package com.kryshyna.java2.lab03;

/**
 * @author Kryshyna Vadym
 */

public class MyStudent {

	private String surName;
	private int kurs;
	private int studentID;
	private double gpa; // grade point average
	private String country;
	
	MyStudent (String _surName, int _kurs, int _studentID,
			double _gpa, String _country){
		surName = _surName;
		kurs = _kurs;
		studentID = _studentID;
		gpa = _gpa; 
		country = _country;
	}
	
	public String getSurName() {
		return surName;
	}

	public int getKurs() {
		return kurs;
	}

	public double getGpa() {
		return gpa;
	}

	public String getCountry() {
		return country;
	}

	public int getStudentID(){
		return studentID;
	}
	
	@Override
	public String toString(){
		return this.studentID+" "+this.surName+" kurs:"+this.kurs+
				" gpa:"+this.gpa+" "+this.country;
	}
}
