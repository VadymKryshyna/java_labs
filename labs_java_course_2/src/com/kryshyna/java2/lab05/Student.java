package com.kryshyna.java2.lab05;

import java.util.Random;

/**
 * @author Kryshyna Vadym
 */

public class Student {
	private String name;
	private String surname;
	private int studID;
	private int group;
	private int sex;

	Student (String _name, String _surname, int _studID, int _group, int _s){
		name = _name;
		surname = _surname;
		studID = _studID;
		group = _group;
		sex = _s;
	}

	public int getGroup(){
		return group;
	}

	public int getStudID(){
		return studID;
	}

	public String getSex(){
		if (sex == 1){	return "man";	}
		else{	return "women";	}
	}

	public int getSexInt(){
		return sex;
	}
	
	@Override
	public String toString(){
		return name + " " + surname + " " + "studID:" + studID + ", group:"+ group + ", " + getSex();
	}

	public static Student createStudent(int id){
		int group[] = {1,2,3,4,5,6,7,8,9,10};
		int s[] = {1,2};
		String []name_w = {"Olja","Nadja","Kate","Lena","Tanja","Ira","Ina"};
		String []name_m = {"Ivan","Petr","Nike","Oleg","Igor","Semen","Vova"};
		String []surname = {"Ivanov","Petrob","Sidorov","Bond","Smith","Putin","Azirov","Kruk","Besson"};
		Random rand = new Random();
		int _s = s[rand.nextInt(s.length)];
		String _name;
		if(_s == 1){	_name = name_m[rand.nextInt(name_m.length)];	}
		else{	_name = name_w[rand.nextInt(name_w.length)];	}
		String _surname = 	surname[rand.nextInt(surname.length)];	
		int _studID = id;	
		int _group = group[rand.nextInt(group.length)];	
		return new Student(_name, _surname, _studID, _group, _s);
	}
}
