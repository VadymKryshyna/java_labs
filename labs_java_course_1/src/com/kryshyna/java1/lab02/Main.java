package com.kryshyna.java1.lab02;

/**
 * @author Kryshyna Vadym
 */

/**
 * ������ ��������� �����. �������� ����� ��������� �������: 
 * � ����������� �� �������� (0 ��� 1) � ������ ������ ������ 
 * ������� ��������� ������ ��� �������� ��� ����� k-�� �������.
 */


public class Main {

	public static void main(String[] args) {
		
		//���������� ������� 0 ��� 1
		double flagDouble = Math.random();
		int flag;
		if (flagDouble > 0.5) flag = 0;
		else flag = 1;
		
		//���������� ����� ������� ������� ���� ������� (����������� 5-���) 
		double kDouble = Math.random();
		int k = (int)((kDouble*10)/2);
		if (k == 0) {k = 2;}
		
		StringBuffer str = new StringBuffer("Hello World!\nTo be, or not to be?\nveni, vidi, vici");
		System.out.println("������� �.�.");
		System.out.println("����� �� ���������:");
		System.out.println(str);
		System.out.println("Flag = " + flag + ", k-������ = " + k);
		
		//������ ������� ����� �������
		char temp = 'o';
		
		//������ ������� ����� �������� �� k-�������
		char temp1 = 'Z';
		
		if(flag == 0){
			System.out.println("Del " + temp);
			for (int i = 0; i < str.length(); i++){
				if(str.charAt(i) == temp){
					str. deleteCharAt(i);
				}
			}	
		} else {	
			System.out.println("Set " + temp1);
			
			//������� �����
			for (int i = 0; i < str.length(); i++){
				if (i == 0)
					str.setCharAt((i + k), temp1);
				if (str.charAt(i) == '\n')
					str.setCharAt((1 + i + k), temp1);
			}
		}
		
		System.out.println();
		System.out.println("����� ����� ���������:");
		System.out.println(str);
		
	}
}
