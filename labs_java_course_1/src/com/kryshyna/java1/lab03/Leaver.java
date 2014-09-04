package com.kryshyna.java1.lab03;

/**
 * @author Kryshyna Vadym
 */

//Класс описывающий Абитуриента

public class Leaver {

	static int count = 0;
	private int idNumber;
	private String fullName;
	private String address;
	private String telephone;
	private int[] mark = new int [5];
	
	public Leaver() {
		count++;
		idNumber = count;
		fullName = null;
		address = null;
		telephone = null;
		}
	
	public Leaver(String fullName, String address, String telephone){
		this();
		this.fullName = fullName;
		this.address = address;
		this.telephone = telephone;
	}
	
	public Leaver(String fullName, String address, String telephone, int[] mark){
		this(fullName, address, telephone);
		this.mark = mark;
	}
	
	@Override	
	public String toString(){
		String s = " ";
		for (int i : mark)
			s = s + i + " ";
		return  "\t" + "idNumber" + idNumber + "\n\t"
				+ "FullName: " + fullName + "\n\t"
				+ "Address: " + address + "\n\t" 
				+ "Telephone: " + telephone + "\n\t"
				+ "Marks: " + s
				;	}
	
	
	public void setFullName(String fullName){
		this.fullName = fullName;			}
	
	public void setAddress(String address){
		this.address = address;	}
	
	public void setTelephone(String telephone){
		this.telephone = telephone;	}
	
	public void setMark(int[] mark){
		this.mark = mark;	}
		
	public String getFullName()	{
		return fullName;	}
	
	public String getAddress()	{
		return address;	}
	
	public String getTelephone()	{
		return telephone;	}
	
	public int[] getMark()	{
		return mark;	}
	
	public double getMidleMark()	{
		int j = 0;
		for (int i = 0; i < mark.length; i++){ j= j + mark[i];}
		return (double)(j / mark.length);	}
	
	public boolean haveGoodMark()	{
		boolean res = true;
		for (int i = 0; i < mark.length; i++)
		{
			if ( mark[i] < 3){  res = false;  }
		}
		return res;	}
}
